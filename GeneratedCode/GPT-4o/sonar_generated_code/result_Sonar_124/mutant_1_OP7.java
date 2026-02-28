import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
            // Unreachable while loop
        }
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        return millisInYear;
    }

    public long showBug3() {
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
            // Unreachable while loop
        }
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
            // Unreachable while loop
        }
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        boolean conditionWhile4 = getCondition();
        while (conditionWhile4) {
            // Unreachable while loop
        }
        return factor / 123; // BUG: Math operands should be cast before assignment
    }
    
    private boolean getCondition() {
        return false;
    }
}