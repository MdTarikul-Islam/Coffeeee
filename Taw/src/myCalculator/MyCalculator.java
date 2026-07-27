package myCalculator;
public class MyCalculator {
    public int result;
    public int add(int n1,int n2){
        System.out.println("int int");
        return n1+n2;
    }
    
    public double add(double n1,int n2){
        System.out.println("double int");
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        System.out.println("int int int");
        return n1+n2+n3;
    }
    public double add(double n1,double n2){
        System.out.println("double double");
        return n1+n2;
    }
    
    
}
