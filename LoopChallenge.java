
/**
 * Write a description of class LoopChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopChallenge
{
    public static void main(String[] args){
        int sum=0;
        for (int i=1; i<=100; i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);
        
        int sum2=0;
        int i=1;
        while (i<=100){
            sum2=sum+i;
            i=i+1;
        }
        System.out.println(sum2);
        
    }
        
}
