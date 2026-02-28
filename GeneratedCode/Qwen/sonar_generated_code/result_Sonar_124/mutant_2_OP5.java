import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                twoThirds = 0.6667f; // This will never be executed
                break;
        }

        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 2:
                millisInYear = 0L; // This will never be executed
                break;
        }

        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 3:
                bigNum = 0L; // This will never be executed
                break;
        }

        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 4:
                bigNegNum = 0L; // This will never be executed
                break;
        }

        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 5:
                myDate = new Date(0); // This will never be executed
                break;
        }

        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 6:
                result = 0L; // This will never be executed
                break;
        }

        return result;
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 7:
                result = 0.0f; // This will never be executed
                break;
        }

        return result;
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This can be changed to true or any logic to make it dynamic
    }

    // Helper method to simulate a dynamic value
    private int getValue(boolean condition) {
        return condition? 1 : 0; // This ensures the switch is always unreachable
    }
}