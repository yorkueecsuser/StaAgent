import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            twoThirds = 0.6667f;
        }
        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            millisInYear = 0L;
        }
        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            bigNum = 0L;
        }
        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            bigNegNum = 0L;
        }
        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            myDate = new Date(0);
        }
        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            result = 0L;
        }
        return result;
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            result = 0.0f;
        }
        return result;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's dynamically determined at runtime
    }
}