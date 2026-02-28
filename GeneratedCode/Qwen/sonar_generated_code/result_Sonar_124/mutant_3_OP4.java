import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
        return twoThirds;
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
        return millisInYear;
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
        return bigNum;
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
        return bigNegNum;
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
        return myDate;
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the outcome
            System.out.println("This is a reachable block");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block");
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}