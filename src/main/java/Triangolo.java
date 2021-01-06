/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melone
 */
public class Triangolo 
{
    private double a;
    private double b;
    private double c;
    
    public Triangolo (double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    
    public String Tipologia()
    {
        String tipo;
        double ipotenusa=0.0, L1=0.0, L2=0.0;
        if (a==b || b==c)
        {
            if (a==b && b==c)
            {
                tipo="equilatero";
            }
            
            else
            {
                tipo="isoscele";
            }
        }
        
        else
        {
            tipo="scaleno";
        }
        
        if (a>b && a>c)
        {
            ipotenusa=a;
            L1=b;
            L2=c;
        }
        if (b>a && b>c)
        {
            ipotenusa=b;
            L1=c;
            L2=a;
        }
        if (c>b && c>a)
        {
            ipotenusa=c;
            L1=b;
            L2=a;
        }
        
        if ((ipotenusa*ipotenusa)==(L1*L1+L2*L2))
        {
            tipo=tipo+", rettangolo";
        }
        return tipo;
    }
    public double Perimetro()
    {
        return a+b+c;
    }
    public double Area()
    {
        double s=(a+b+c)/2;
        return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
    }
    
}
