import java.util.Date;

class AbsoluteTimeBugDemo {

    // This method demonstrates the bug by converting an int to a long and using it to create a Date
    public Date showBug(int secondsSinceEpoch) {
        long millisecondsSinceEpoch = secondsSinceEpoch * 1000; // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        
        // Unreachable if statement mutation
        boolean condition = getCondition(); // This method ensures non-compile-time constant condition
        if (condition) {
            System.out.println("This block is unreachable.");
        }
        
        return new Date(millisecondsSinceEpoch);
    }

    // Method to simulate a runtime condition for the unreachable if statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(2147483647); // Max int value to demonstrate the bug
        System.out.println("Generated Date: " + date);
    }
}