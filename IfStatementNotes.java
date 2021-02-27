
/**
 * Demo of it statements
 *
 * @author Eason
 * @version 2/27/2021
 */
public class IfStatementNotes
{
    public static void main(String[] args){
        //In java we can compare values and get a boolean value
        int x=5;
        
        //In this example, since the statement inside the parenthesis is true, the code inside the if-statement executes
        /*
        if (x>6.5){
            System.out.println(x+" is greater than 6.5");
        }
        */
       
        /*
        if (x>75){//doens't return anything since the statement is false
            System.out.println(x+" is greater than 7.5");
        }
        */
        
        //if we want to have java print something else if the statement if false, then we can use "else"
        /*
        if (x>6.5){
            System.out.println(x+" is greater than 6.5");
        }
        else{
            System.out.println(x+" is not greater than 6.5");
            
        }
        */
       
       
       
        
       //we can also have multiple comparison statements inside an if statement
       //==, >=, <=, <, >, are ways you can compare values
       //you can also link the two statements by using 'and' && or 'or' ||
       //true||false would return as true, true&&false would return as false
       
       /*
       if (x>7.5 || x<6){ //returns false since both statements are false
           System.out.println("true");
        }
       */
      
      /*
       if (x<80 && x<5){ //returns false since one of the value is false
        }
       */
      
      //like mathematics, boolean operations have their own order of order of operations. && is always valued before ||
      /*
      if (x<7 || x<8 && x>5){//evaluates to true since x<8 && x>5 is true, then true || false would return true
        }
    */
      //go over grade program
      int grade = 105;
      if (grade>=100){
          System.out.println("A+");
        }
       
        
      else if (grade >=90){
          System.out.println("A");
        }
      else if (grade >=80){
          System.out.println("B");
        }
      else if (grade >=70){
          System.out.println("C");
        }
      else if (grade >=60){
          System.out.println("D");
        }
      else{
          System.out.println("F");
        }
    }
} 
