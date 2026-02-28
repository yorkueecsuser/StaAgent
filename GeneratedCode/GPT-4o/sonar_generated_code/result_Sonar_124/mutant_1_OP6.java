import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* This for loop is unreachable */ }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* This for loop is unreachable */ }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* This for loop is unreachable */ }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* This for loop is unreachable */ }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* This for loop is unreachable */ }
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is evaluated at runtime
    }
}