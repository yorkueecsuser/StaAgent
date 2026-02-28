import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            twoThirds = 2.0f / 3.0f;
        } else {
            // Alternative unreachable code
            twoThirds = 1.0f;
        }
        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            millisInYear = 1_000L * 3_600L * 24L * 365L;
        } else {
            // Alternative unreachable code
            millisInYear = 0L;
        }
        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            bigNum = Integer.MAX_VALUE + 2L;
        } else {
            // Alternative unreachable code
            bigNum = Integer.MAX_VALUE;
        }
        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            bigNegNum = Integer.MIN_VALUE - 1L;
        } else {
            // Alternative unreachable code
            bigNegNum = Integer.MIN_VALUE;
        }
        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            myDate = new Date(seconds * 1_000L);
        } else {
            // Alternative unreachable code
            myDate = new Date(0);
        }
        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            return factor * 10_000L;
        } else {
            // Alternative unreachable code
            return 0L;
        }
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            return factor / 123.0f;
        } else {
            // Alternative unreachable code
            return 0.0f;
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's not a compile-time constant
    }
}