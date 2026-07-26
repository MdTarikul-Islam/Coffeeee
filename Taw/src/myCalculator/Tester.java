package myCalculator;
public class Tester {
    public static void main(String[] args) {
        MyCalculator c1=new MyCalculator();
        //Case-1
        c1.add(4,5);
        System.out.println("=======");
        //Case-2
        int ans=c1.add(4,5);
        System.out.println(ans);
        System.out.println("=======");
        //Case-3
        System.out.println(c1.add(4,5));
        System.out.println("=======");
        //Case=4
        int z=7+c1.add(4,5);
        System.out.println(z);
    }
}
