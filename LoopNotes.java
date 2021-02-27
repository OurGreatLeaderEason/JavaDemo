
/**
 * Understand for-loops and while-loops
 *
 * @author Eason
 * @version 2/27/2021
 */
public class LoopNotes
{
    
    public static void main(String[] args){
        //if we want java to do a certain task many many times, we can use loops to achieve this.
        //there are 2 types of loops, for loops and while loop
        
        //if we want to print a message 10 times, we can use loops to do this
        
        //the following example is a for-loop
        /*
        for (int i=0; i<10; i=i+1){// we create integer i and set it to 0. Everytime the code inside the for-loop executes, i increases by 1. 
            //When i is no longer less than 10, the loop stops.
            System.out.println("Hi");
            
        }
        */
        
        //to better demonstrate this, let's keep track the value of i
        /*
        for (int i=0; i<10; i=i+1){
            System.out.println(i);
        }
        */
       
        //for loops are good for doing a task a certain amount of time, but you can also do the task with a while loop
        
        int i=0;
        while (i<10){//the code runs as long as i<10
            System.out.println("hi");
            i+=1;
        }
        //as you can see, for-loops are much better for repeating a code a certain amount of time. While loops is for repeating a task until something happens
        
        
    }
}
