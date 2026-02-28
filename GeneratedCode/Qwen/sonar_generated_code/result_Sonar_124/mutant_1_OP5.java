import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                twoThirds = 2.0f / 3.0f;
                break;
            case 2:
                twoThirds = 1.0f;
                break;
        }

        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                millisInYear = 1_000L * 3_600L * 24L * 365L;
                break;
            case 2:
                millisInYear = 1_000L * 3_600L * 24L * 366L;
                break;
        }

        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                bigNum = (long) Integer.MAX_VALUE + 2L;
                break;
            case 2:
                bigNum = (long) Integer.MAX_VALUE + 3L;
                break;
        }

        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                bigNegNum = (long) Integer.MIN_VALUE - 1L;
                break;
            case 2:
                bigNegNum = (long) Integer.MIN_VALUE - 2L;
                break;
        }

        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                myDate = new Date((long) seconds * 1_000L);
                break;
            case 2:
                myDate = new Date((long) seconds * 2_000L);
                break;
        }

        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                return (long) factor * 10_000L;
            case 2:
                return (long) factor * 20_000L;
        }
        return 0;
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                return (float) factor / 123.0f;
            case 2:
                return (float) factor / 246.0f;
        }
        return 0.0f;
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's dynamically determined
    }

    // Helper method to simulate a dynamic switch value
    private int getValue(boolean condition) {
        return condition? 1 : 0; // This will always return 0, but it's dynamically determined
    }
}