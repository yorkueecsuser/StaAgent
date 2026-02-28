import java.util.Date;

class AbsoluteTimeBugDemo {

    // This method demonstrates the bug by converting an int to a long and using it to create a Date
    public Date showBug(int p) { // Renaming secondsSinceEpoch to p
        long millisecondsSinceEpoch = p * 1000; // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        return new Date(millisecondsSinceEpoch);
    }

    public static void main(String[] args) {
        AbsoluteTimeBugDemo d = new AbsoluteTimeBugDemo(); // Renaming demo to d
        Date date = d.showBug(2147483647); // Max int value to demonstrate the bug
        System.out.println("Generated Date: " + date);
    }
}