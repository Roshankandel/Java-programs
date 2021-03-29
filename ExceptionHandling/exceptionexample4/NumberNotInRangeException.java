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
public class NumberNotInRangeException extends Exception{
    public NumberNotInRangeException(String msg) {
      super(msg);
    }   
}
