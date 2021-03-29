/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample3;
//negative number Exception
import java.util.Scanner;
public class ExceptionExample3 {

  
    public static void main(String[] args) {
        CheckNum obj=new CheckNum();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int num=scan.nextInt();
        try{
            obj.checknumber(num);
        }
        catch(NegativeNumberException e){
          System.out.println("Exception caught!!"+e);
        }
    }
    
}
