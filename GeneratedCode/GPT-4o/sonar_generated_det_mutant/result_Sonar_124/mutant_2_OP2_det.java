import java.util.Date;

class MathOperandsBugExample {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        return bigNum;
    }
public long showBug4() {
    long bigNegNum = Integer.MIN_VALUE - 1;
    bigNegNum = Integer.MIN_VALUE - 1;
    return bigNegNum;
}

    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }
}