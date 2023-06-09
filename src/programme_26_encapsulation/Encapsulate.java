package programme_26_encapsulation;

public class Encapsulate {
    //private variable declared these can only be acccessed by public method of class
    private String name;
    private int rollNo;
    private  int age;
    // set method for name to access private variable
private void setName(String name){
    this.name = name;

}
//getmethod for name to access private variable
public String getName(){
    return  name;
}
   public int getRollNo() {
        return rollNo;
    }

    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;

    }
}
