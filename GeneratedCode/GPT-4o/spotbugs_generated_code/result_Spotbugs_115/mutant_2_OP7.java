import java.util.Date;

class AbsoluteTimeBugDemo {

    // This method demonstrates the bug by converting an int to a long and using it to create a Date
    public Date showBug(int secondsSinceEpoch) {
        long millisecondsSinceEpoch = secondsSinceEpoch * 1000; // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        
        return new Date(millisecondsSinceEpoch);
    }
    
    // Method to ensure the while loop condition is dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        AbsoluteTimeBugDemo demo = new AbsoluteTimeBugDemo();
        Date date = demo.showBug(2147483647); // Max int value to demonstrate the bug
        System.out.println("Generated Date: " + date);
    }
}