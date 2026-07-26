package oop;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahin Islam", 
                "male", 
                245252);
        teacher1.displayInformation();
        Teacher teacher2 = new Teacher("Alam Islam", 
                "male", 
                345234523);
        teacher2.displayInformation();
        
        Teacher teacher3=new Teacher();
        teacher3.displayInformation();
    }
}
