
/**
 * Write a description of class Challenge5 here.
 *
 * @author Eason
 * @version 2/21/2021
 */
import java.io.*;
import java.util.*;
public class Challenge5
{
    public static void main(String[] args){
        Scanner kbReader=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i=kbReader.nextInt();
        if (i%2==0){
            System.out.println(i+" is an even number");
        }
        else{
            System.out.println(i+" is an odd number");
        }
        
    }
    
    
}
