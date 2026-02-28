import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 9999: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 8888: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 7777: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 6666: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 5555: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 4444: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 3333: // This case will never be hit
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }

    private int getValue() {
        // This method should return a value that does not match any of the case statements
        return 0;
    }
}