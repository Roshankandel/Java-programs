/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample3;

/**
 *
 * @author DeLL
 */
public class CheckNum  {

   public void checknumber(int a)throws NegativeNumberException{
   if(a>=0){
    System.out.println("The number you have entered is valid");
  }
   else{
    String msg="Please enter the positive number!";
    throw new NegativeNumberException(msg);
   }
 }

}