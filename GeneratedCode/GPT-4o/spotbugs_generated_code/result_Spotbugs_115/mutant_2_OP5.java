import java.util.Date;

class AbsoluteTimeBugDemo {

    // This method demonstrates the bug by converting an int to a long and using it to create a Date
    public Date showBug(int secondsSinceEpoch) {
        long millisecondsSinceEpoch = secondsSinceEpoch * 1000; // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case, but unreachableValue will never match case 999
                break;
        }
        return new Date(millisecondsSinceEpoch);
    }

    private int getUnreachableValue() {
        // This method simulates getting a non-final variable that will not match the switch case
        return 0; // As long as this doesn't return 999, the switch case remains unreachable
    }

    public static void main(String[] args) {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(2147483647); // Max int value to demonstrate the bug
        System.out.println("Generated Date: " + date);
    }
}