package programmes_Week4;
/**WAP java program to overl;oasd constructor*/
public class Programme_25_Constructor_OverloadingExample {
    int id;
    String name;
    int age;

    //Creating two arg constructor
    Programme_25_Constructor_OverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //Creating three arg constructor
    Programme_25_Constructor_OverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme_25_Constructor_OverloadingExample s1 = new Programme_25_Constructor_OverloadingExample(111, "Karan");
        Programme_25_Constructor_OverloadingExample s2 = new Programme_25_Constructor_OverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

