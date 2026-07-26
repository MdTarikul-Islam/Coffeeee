
package houses;

public class Tester {
    public static void main(String[] args) {
        Houses h1=new Houses();
        h1.window=6;
        h1.door=2;
        Houses h2=new Houses();
        h2.window=4;
        h2.door=2;
        System.out.println("h1 ======");
        h1.view();
        System.out.println("h2 ======");
        h2.view();
        h1.increaseDoor(1);
        System.out.println("h1=======");
        h1.view();
        h2.increaseDoor(2);
        System.out.println("h2 ======");
        h2.view();
    }
}
