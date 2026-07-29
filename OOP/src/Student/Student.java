package Student;
public class Student {
    public String name;
    public int id;
    public Student(String nm,int i){
        name=nm;
        id=i;
    }
    public void updateID(int i){
        if(i>0){
            id=i;
        }
        else{
            System.out.println("Invalid Id given");
        }
    }
    public void showDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
