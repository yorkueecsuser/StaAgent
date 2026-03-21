import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 10: Storing a Double into a Number array
        numberArray[1] = new Integer(5); // Line 11: ArrayIndexOutOfBoundsException will be thrown at runtime
        addUnreachableSwitchStatement();
    }

    private void addUnreachableSwitchStatement() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This line will never be executed.");
                    break;
                default:
                    System.out.println("Default case.");
            }
        }
    }
}