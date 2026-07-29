package oop;
public class FactorialTest {
    public static void main(String[] args) {
        Factorial ob=new Factorial();
        int result =ob.fact(5);
        System.out.println("Factorial of 5 = "+result);
        result=ob.fact(4);
        System.out.println("Factorial of 4 = "+result);
        
    }
}
