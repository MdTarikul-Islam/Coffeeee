package myCalculator;
public class Tester {
    public static void main(String[] args) {
        MyCalculator c1=new MyCalculator();
        System.out.println(c1.add(4.5, 8.5));
        System.out.println(c1.add(4, 5));
        System.out.println(c1.add(4,5,8));
        System.out.println(c1.add(4.5,5));
    }
}
