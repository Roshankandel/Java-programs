/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab3;

/**
 *
 * @author DeLL
 */
public class Javalab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        a=0;
        b=5;
        try{
           c=b/a;
           System.out.println("the division is:"+c);
        }
        catch(ArithmeticException e){
           System.out.println("Exception caught!!"+e);
        }
        finally{
         System.out.println("Inside the final block");
        }
    }
    
}
