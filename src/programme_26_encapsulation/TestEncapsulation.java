package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj =new Encapsulate();
        //setting value of the variables
        System.out.println("Prime's Name :"+obj.getName());
        System.out.println("Prime's Rollno :"+obj.getRollNo());
        System.out.println("Prime's Age :"+obj.getAge());
        //Direct access of rollno is not possible due to encapsulation
    }
}
