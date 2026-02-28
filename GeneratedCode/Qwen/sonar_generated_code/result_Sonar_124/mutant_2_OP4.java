import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            twoThirds = 0.6667f;
        } else {
            // Alternative code that should also never run
            twoThirds = 0.6666f;
        }
        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            millisInYear = 31536000000L;
        } else {
            // Alternative code that should also never run
            millisInYear = 31536000001L;
        }
        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            bigNum = Long.MAX_VALUE;
        } else {
            // Alternative code that should also never run
            bigNum = Long.MIN_VALUE;
        }
        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            bigNegNum = Long.MAX_VALUE;
        } else {
            // Alternative code that should also never run
            bigNegNum = Long.MIN_VALUE;
        }
        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            myDate = new Date(0);
        } else {
            // Alternative code that should also never run
            myDate = new Date(1);
        }
        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's dynamically determined at runtime
    }
}