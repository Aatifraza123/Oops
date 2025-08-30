 class Student{
    String name;
    int roll_no;
    protected String pasword;
}

class Car{
    String name;
    int manufacture;
    String model;
}
public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Car obj2 = new Car();
        obj2.name = "BMW";
        obj2.manufacture = 1956;
        obj2.model = "i8723";


        obj1.name = "aatif";
        obj1.roll_no = 25;
        obj1.pasword = "razaaatif25";

        System.out.println(obj1.name);
        System.out.println(obj1.roll_no);
        System.out.println(obj1.pasword);

        System.out.println(obj2.name);
        System.out.println(obj2.manufacture);
        System.out.println(obj2.model);
    }
}