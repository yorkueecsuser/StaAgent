import java.util.Date;

class AbsoluteTimeBugDemo {

    // This method demonstrates the bug by converting an int to a long and using it to create a Date
    public Date showBug(int secondsSinceEpoch) {
        long millisecondsSinceEpoch = secondsSinceEpoch * 1000; // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        
        // Unreachable switch statement mutation
        int unreachableCondition = (int) System.currentTimeMillis() % 2; // Generates either 0 or 1, so ensures switch condition is dynamic
        switch (unreachableCondition) {
            case 100: // This case is unreachable because unreachableCondition will never be 100
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        return new Date(millisecondsSinceEpoch);
    }

    public static void main(String[] args) {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(2147483647); // Max int value to demonstrate the bug
        System.out.println("Generated Date: " + date);
    }
}