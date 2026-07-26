package cat;
public class Cat {
    
    public String color; //instance var
    public String action="sitting"; //instance var
    
    public void changeAction(String action){
        this.action=action;
    }
    
    public void details(){ //instance method
        System.out.println(color+" cat is "+action);
    }
    
    
}
