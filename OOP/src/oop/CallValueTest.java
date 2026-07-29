package oop;
public class CallValueTest {
    public static void main(String[] args) {
        CallByValue ob=new CallByValue();
        int x=10; // primitive
        System.out.println("x before call : "+x);
        ob.change(x);
        System.out.println("x after call : "+x);
    }
}
