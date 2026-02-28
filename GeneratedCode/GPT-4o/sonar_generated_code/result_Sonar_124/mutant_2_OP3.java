import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        boolean condition = getUnreachableCondition(); // Unreachable if statement
        if (condition) {
            System.out.println("This block is never executed.");
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}