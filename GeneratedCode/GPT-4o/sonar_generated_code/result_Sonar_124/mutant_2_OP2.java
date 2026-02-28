import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        float twoThirdsDup = 2 / 3; // Duplicated assignment statement
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        long millisInYearDup = 1_000 * 3_600 * 24 * 365; // Duplicated assignment statement
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        long bigNumDup = Integer.MAX_VALUE + 2; // Duplicated assignment statement
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        long bigNegNumDup = Integer.MIN_VALUE - 1; // Duplicated assignment statement
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        Date myDateDup = new Date(seconds * 1_000); // Duplicated assignment statement
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        long resultDup = factor * 10_000; // Duplicated assignment statement
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        float resultDup = factor / 123; // Duplicated assignment statement
        return result;
    }
}