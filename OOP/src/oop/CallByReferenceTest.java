package oop;
public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference r1=new CallByReference();
        r1.name="Panis";
        System.out.println("Before calling : "+r1.name);
        r1.change(r1);
        System.out.println("After Calling : "+r1.name);
    }
}
