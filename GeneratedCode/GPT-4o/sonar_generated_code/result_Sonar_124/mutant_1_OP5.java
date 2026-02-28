import java.util.Date;

class MathOperandsBugDemo {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        // Mutant: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 9999:
                System.out.println("This is unreachable.");
                break;
        }
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        // Mutant: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 8888:
                System.out.println("This is unreachable.");
                break;
        }
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        // Mutant: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 7777:
                System.out.println("This is unreachable.");
                break;
        }
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        // Mutant: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 6666:
                System.out.println("This is unreachable.");
                break;
        }
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        // Mutant: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 5555:
                System.out.println("This is unreachable.");
                break;
        }
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }

    // Helper method to provide a non-final variable for switch conditions
    private int getUnreachableSwitchValue() {
        return -1; // Always returns a value that does not match any case
    }
}