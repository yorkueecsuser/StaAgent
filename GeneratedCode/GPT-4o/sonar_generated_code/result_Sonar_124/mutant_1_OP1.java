import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        int rfnqmzay = 42; // Dead Store: Unused integer variable
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        double hbnzvqop = 3.14; // Dead Store: Unused double variable
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        String pxaylgvu = "unused"; // Dead Store: Unused string variable
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        char jzklqery = 'a'; // Dead Store: Unused char variable
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        boolean vyozmxpd = true; // Dead Store: Unused boolean variable
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        byte xzmpqjwv = 0; // Dead Store: Unused byte variable
        return result;
    }
}