package programmes_Week4;

/** Sum Calculator
 * Write a class eith the name SimpleCalculator.The class needs two fields (instance variables) with names firstNumber and SeconddNumber both of type double.
 * Write the following methods (instance methods):
 * Method first getFirstNumber without any parameters,it needs to return the value of the firstNumber field
 * Method named getSecondNumber without any parametrer , it needs to return the value of the secondNumber field
 * Method named setfirstNumber with one parameter type of double,it needs to the value of the first number field.
 * Method named setSecondNumber with on eparameter type of double.it needs to set the value of the second number field.
 * Method named getAAdditionResult without any parameters,it needs to return the result of the field values of first number and second number.
 * Method named getSubteractionResult without any parameters,it needs to reweturn the result of subtracting the field values of first number and second number.
 Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the
 * field values of firstNumber and secondNumber.
 * Method named getDivisionResult without any parameters, it needs to return the result of dividing the field
 * values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * <p>
 * <p>
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * add= 9.0 is printed because 5.0 + 4 is 9.0
 * subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * divide= 0.0 is printed because secondNumber is set to 0
 */
public class Programme_18_SimpleCalculator {
 double firstNumber;
 double secondNumber;
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public  double getadditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public  double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getmultiplicationResult(){
        return  getFirstNumber()* getSecondNumber();
    }
    public double getDivisionResult(){
        if (getSecondNumber()==0){
            return 0;
        }else
            return  getFirstNumber()/getSecondNumber();
    }

    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getadditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getmultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}


