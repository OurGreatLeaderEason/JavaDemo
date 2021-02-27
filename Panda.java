
/**
 * Write a description of class Panda here.
 *
 * @author Eason
 * @version 2/27/2021
 */
public class Panda
{   
    //here are instance variables, basically the attribute that our panda object is going to have
    private boolean is_asleep;
    private int age;
    private int weight;
    private String size;
    private String name;
    
    public Panda(boolean sleep, int old, int mass, String howbig, String nombre){
        this.is_asleep=sleep;
        this.age=old;
        this.weight=mass;
        this.size=howbig;
        this.name=nombre;
        
    }
    
    public int get_age(){
        System.out.println(this.age);
        return this.age;
        
    }
    public void set_age(int newage){
        this.age=newage;
    }
    public boolean is_asleep(){
        if (this.is_asleep==true){
            System.out.println(this.name+" is alseep");
            
        }
        else{
            System.out.println(this.name+" is awake");
        }
        return this.is_asleep;
    }
    public void wakeup(){
        if (this.is_asleep==true){
            System.out.println(this.name+" woke up");
            this.is_asleep=false;
        }
        else{
            System.out.println(this.name+" is already awake");
            
        }
        
    }
    public void sleep(){
        if (this.is_asleep==false){
            System.out.println(this.name+" went to sleep");
            this.is_asleep=true;
        }
        else{
            System.out.println(this.name+" is already sleeping");
            
        }
        
    }
    public int get_weight(){
        return this.weight;
    }
    public void set_weight(int new_weight){
        this.weight=new_weight;
        
    }
    public String get_size(){
        return this.size;
    }
    public void set_size(String new_size){
        this.size=new_size;
    }
    public String get_name(){
        return this.name;
        
    }
    public void set_name(String new_name){
        this.name=new_name;
    }
    public void eat_bamboo(){
        System.out.println("Po ate some bamboo");
    }
    
    
    
    
}
