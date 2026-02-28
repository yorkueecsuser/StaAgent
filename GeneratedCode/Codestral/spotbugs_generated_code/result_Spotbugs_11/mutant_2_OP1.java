import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 8: Storing a Double into a Number array
        int unusedVariable = 10; // Dead Store: Adding an unused variable declaration
        numberArray[1] = new Integer(5); // Line 10: ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}