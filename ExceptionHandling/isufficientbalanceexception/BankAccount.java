/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isufficientbalanceexception;

/**
 *
 * @author DeLL
 */
public class BankAccount {
    double amount;
    BankAccount(){
      amount=0.0;
    }
    void deposit(double amt){
      amount+=amt;
    }
    void Withdraw(double wa) throws MyException{
      if(amount>=wa){
         System.out.println("Withdrawn successful!! Remaining balance is:"+(amount-=wa));
         
      }
      else{
        double amtrequired=wa-amount;
        throw new MyException("Insufficient balance!! your account has"+amtrequired+" rupees less than you want to withdraw!");
        
                 
      }
          
    }
}
