import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return myDate;
    }

    public long compute(int factor) {
        long result = factor * 10_000; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return result;
    }

    public float compute2(long factor) {
        float result = factor / 123; // BUG: Math operands should be cast before assignment
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable switch case 1");
                break;
            default:
                System.out.println("Default unreachable case");
        }
        return result;
    }

    private int getUnreachableValue() {
        return 0; // This method always returns 0, making the switch unreachable.
    }
}