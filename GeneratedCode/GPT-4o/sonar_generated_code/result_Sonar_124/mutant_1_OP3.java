import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in showBug1.");
        }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in showBug2.");
        }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in showBug3.");
        }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in showBug4.");
        }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in showBug5.");
        }
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in compute.");
        }
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block in compute2.");
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false;
    }
}