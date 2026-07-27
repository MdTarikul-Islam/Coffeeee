package taw;
public class Student {
    public String name; //instance variable
    public int id;   //instance variable
    public double cgpa; // instance variable
    public Student(){
        System.out.println("no parameter I was called");
    }
    public Student(String name,int id){
        System.out.println("I was called");
        this.name=name;
        this.id=id;
    }
    public Student(String name,int id,double cgpa){
        System.out.println("3 parameter I was called");
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    //access_modifier void/return_type methodName(parameters)
    public void showDetails(){ //instance method
        System.out.println(name+" "+id+" "+cgpa);
    }
    public void standUp(){
        System.out.println(name+" is now standing");
    }
}
