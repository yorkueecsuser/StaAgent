import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print due to the unreachable condition.");
        }
        return result;
    }

    // Method that always returns false, used to create an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }
}