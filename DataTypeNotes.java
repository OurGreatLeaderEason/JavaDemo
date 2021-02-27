
/**
 * A demo of different Data Types
 *
 * Notes to demonstrate data types
 * @Eason Xiao
 * @version 2/27/2021
 */
public class DataTypeNotes
{
    
    public static void main(String[] args){
        //Data is stored in Java in variables, different types of data have to be stored differently
        //There are 4 types of data that we are going to be working with today
        
        String s="Hello";
        //String are a type of data that are text. You could store numbers as Strings, but java won't treat them as numbers
        //This piece of code is an assignment operator. It assigns the value "Hello" to a String variable called s. 
        //s now contains the value of "Hello"
        
        String b=new String("Hello");
        //another way to assign strings values to string variables
        
        //System.out.println(s);
        //System.out.println(b);
        
        //System.out.println(s+b);
        //concatentaion still works!
        
        //Since String is technically a class, there are cool methods that we can apply to it
        //System.out.println(s.toLowerCase());
        //System.out.println(b.toUpperCase());
        
        //There are 2 ways to store numeric data types: int and double
        //int is for integers and double is for decimals
        int i=2;
        double d=2.5;
        
        //System.out.println(i);
        //System.out.println(d);
        //System.out.println(i+d);
        //When an int is added to a double, the sum automatically becomes a double since Java doesn't like to lose information
        
        //int a=2.5; illegal because integers must be whole numbers
        double e=2; //legal because java will just change 2 to 2.0
        
        //Arithmetic operations: the operations in java are still largely the same
        //+, -, *, /, and %. 5%2 tells you the remainder of 5 divided by 2, which would be 1
        
        int l=45*(1+2);//should print out 135
        //System.out.println(l);
        
        int k=45/6; //What is the value of k?
        //System.out.println(k); 
        //45/8=5.625, but since k has to be an integer, it loses its decimal parts.
        
        //booleans are used to store true/false data. They can only be set to true or false
        Boolean one=true;
        Boolean two=false;
        
        System.out.println(one);//returns true
        
        
        

        
        
        
        
        
        
    }
}
