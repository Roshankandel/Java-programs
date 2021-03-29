//Wap to demonstrate the number not in range exception
package exceptionexample4;
import java.util.Scanner;
public class ExceptionExample4 {

    public static void main(String[] args) {
       int age;
       CheckRange obj=new CheckRange();
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your age:");
       age=scan.nextInt();
       try{
        obj.checkrange(age);
       }
       catch(NumberNotInRangeException e){
           System.out.println("Exception caught!!"+e);
       }
    }
    
}
