
package taw;
public class Student {
    public String name; //instance variable
    public String id;   //instance variable
    
    //access_modifier void/return_type methodName(parameters)
    public void showDetails(){ //instance method
        System.out.println(name+" "+id);
    }
    
    public void standUp(){
        System.out.println(name+" is now standing");
    }
}
