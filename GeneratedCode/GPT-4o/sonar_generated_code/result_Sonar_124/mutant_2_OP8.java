import java.util.Date;

class MathOperandsBugDemo {

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
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }

    // Mutant code
    public float showBug1_mutant() {
        float x = (float) 2 / 3;
        return x;
    }

    public long showBug2_mutant() {
        long y = 1_000L * 3_600 * 24 * 365;
        return y;
    }

    public long showBug3_mutant() {
        long z = (long) Integer.MAX_VALUE + 2;
        return z;
    }

    public long showBug4_mutant() {
        long a = (long) Integer.MIN_VALUE - 1;
        return a;
    }

    public Date showBug5_mutant(long seconds) {
        Date b = new Date(seconds * 1_000L);
        return b;
    }

    public long compute_mutant(int factor) {
        int c = factor;
        return c * 10_000L;
    }

    public float compute2_mutant(long factor) {
        long d = factor;
        return (float) d / 123;
    }
}