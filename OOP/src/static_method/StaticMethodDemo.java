package static_method;

public class StaticMethodDemo {
    static int x=10;
    void display1(){
        System.out.println("I am non static method");
    }
    
    static void displays2(){
        System.out.println(" "+x);
        System.out.println("I am static method");
    }
}
