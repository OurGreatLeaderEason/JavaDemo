
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
        
        //String s="Hello";
        //String are a type of data that are text. You could store numbers as Strings, but java won't treat them as numbers
        //This piece of code is an assignment operator. It assigns the value "Hello" to a String variable called s. 
        //s now contains the value of "Hello"
        
        //String b=new String("Hello");
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
        //int i=2;
        //double d=2.5;
        
        //System.out.println(i);
        //System.out.println(d);
        //System.out.println(i+d);
        //When an int is added to a double, the sum automatically becomes a double since Java doesn't like to lose information
        
        //int a=2.5; illegal because integers must be whole numbers
        //double e=2; //legal because java will just change 2 to 2.0
        
        //Arithmetic operations: the operations in java are still largely the same
        //+, -, *, /, and %. 5%2 tells you the remainder of 5 divided by 2, which would be 1
        
        //int l=45*(1+2);//should print out 135
        //System.out.println(l);
        
        //int k=45/6; //What is the value of k?
        //System.out.println(k); 
        //45/8=5.625, but since k has to be an integer, it loses its decimal parts.
        
        //k=k+5; //returns 10 since u can apply arithmetic operations to it
        
        //booleans are used to store true/false data. They can only be set to true or false
        //Boolean one=true;
        //Boolean two=false;
        
        //System.out.println(one);//returns true
        
        //Casting: Changes the type of data. Not all types can be casted. You can't cast text into a number.
        
        //String a="62";
        //double b=62.62;
        //int i=Integer.parseInt(a); //you can't directly cast String to int. Have to use a special method.
        
        //double to int
        //i=(int) b;
        //System.out.println(i);
        //prints 62 since the decimal part is lost
        
        //int to double
        //int i=62;
        //double b=i;
        //System.out.println(b);
        //returns 62.0 since it is now a double
        
        //int to String
        //int i=62;
        //String s=Integer.toString(i);
        //System.out.println(s);
        
        //double to String
        //double d=62.62;
        //String s=Double.toString(d);
        //System.out.println(s);
        
        /*
         * Something else to keep in mind:
         * Variable names must start with letter and contain no spaces or weird symbols. Underline is allowed
         * Illegal variable names: 123, int counter, int$%#, also can't be keywords like true, false, and, or, String, int, boolean, etc
         * Legal Variable names: d123, int_counter,          */
        
        

        
        
        
        
        
        
    }
}
