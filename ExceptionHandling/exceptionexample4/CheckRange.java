/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample4;

/**
 *
 * @author DeLL
 */
public class CheckRange {
    public void checkrange(int age)throws NumberNotInRangeException {
       if(age>=18)
       {
         System.out.println("Congratulations! you can vote!");
       }
       else{
           String msg="You are young to vote!!";
         throw new NumberNotInRangeException(msg);
       }
    }
}
