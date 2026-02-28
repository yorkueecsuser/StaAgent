import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0.0f;
        } else {
            return twoThirds;
        }
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0L;
        } else {
            return millisInYear;
        }
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0L;
        } else {
            return bigNum;
        }
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0L;
        } else {
            return bigNegNum;
        }
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return null;
        } else {
            return myDate;
        }
    }

    public long compute(int factor) {
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0L;
        } else {
            return factor * 10_000; // BUG: Math operands should be cast before assignment
        }
    }

    public float compute2(long factor) {
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is intentionally unreachable
            return 0.0f;
        } else {
            return factor / 123; // BUG: Math operands should be cast before assignment
        }
    }
    
    // Method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}