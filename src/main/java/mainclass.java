/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melone
 */
public class mainclass 
{
    public static void main (String[] args)
    {
        Triangolo c=new Triangolo(8.0,8.0,10.0);
        System.out.println(c.Tipologia());
        System.out.println(c.Perimetro());
        System.out.println(c.Area());
    }
}
