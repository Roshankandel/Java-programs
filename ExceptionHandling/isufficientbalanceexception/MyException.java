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
public class MyException extends Exception {
  public  MyException(String msg){
//supplies this message to the parent class constructor
    super(msg);
  }  
}
