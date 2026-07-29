package Car;
public class Tester {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car("BMW","M4");
        Car c3=new Car("Toyota","Premio");
        Car c4=new Car("AUDI","R8",2019);
        c1.details();
        c2.details();
        c3.details();
        c4.details();
    }
}
