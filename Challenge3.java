
/**
 * 
 *
 * @author Eason
 * @version 2/27/2021
 */
import java.io.*;
import java.util.*;
public class Challenge3
{
    public static void main(String[] args){
        Scanner kbReader=new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstname=kbReader.next();
        System.out.println("What is your last name?");
        String lastname=kbReader.next();
        System.out.println("Your full name is "+firstname+" "+lastname+".");
    }
    
}
