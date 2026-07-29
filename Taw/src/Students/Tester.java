package Students;
public class Tester {
    public static void main(String[] args) {
        Student s1=new Student("Bob",11);
        Student s2=new Student("Carol",33);
        Course c1=new Course("CSE111","object Oriented Programming");
        Course c2=new Course("MAT120");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.showDetail();
    }
}
