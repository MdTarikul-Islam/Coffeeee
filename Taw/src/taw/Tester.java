
package taw;

public class Tester {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Bob";
        s1.id="11";
        s2.name="Carol";
        s2.id="33";
        s1.standUp();
        s2.standUp();
        s1.showDetails();
        System.out.println("=======");
        s2.showDetails();
        
    }
}
