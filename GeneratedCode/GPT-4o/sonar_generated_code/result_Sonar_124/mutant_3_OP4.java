import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This is the default case");
        }
        
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println("Default execution path");
        }
        
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code here");
        } else {
            System.out.println("Execution continues normally");
        }
        
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block will not execute");
        } else {
            System.out.println("This block will execute");
        }
        
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("Normal code execution");
        }
        
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code won't be executed");
        } else {
            System.out.println("Default path executed");
        }
        
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Code here is unreachable");
        } else {
            System.out.println("Normal execution path");
        }
        
        return result;
    }

    // Helper method to ensure dynamic condition
    private boolean getCondition() {
        return false;
    }
}