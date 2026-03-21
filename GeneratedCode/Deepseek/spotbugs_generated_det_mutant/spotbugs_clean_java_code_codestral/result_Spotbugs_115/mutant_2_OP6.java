import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long

        // Mutant: Unreachable for loop
        boolean shouldLoop = getCondition(); // Assume getCondition() is a method that returns a boolean
        for (int i = 0; shouldLoop; i++) {
            // This loop will never be executed since shouldLoop is always false
            System.out.println("This is an unreachable loop");
        }

        return new Date(milliseconds);
    }

    // Assuming the presence of this method for the unreachable loop condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        int futureSeconds = Integer.MAX_VALUE; // A value that will overflow when multiplied by 1000
        Date malformedDate = getMalformedDate(futureSeconds);
        System.out.println("Malformed date for seconds=" + futureSeconds + ": " + malformedDate);
    }

    public static void main(String[] args) {
        TimeConversionBug bugDemo = new TimeConversionBug();
        bugDemo.showBug();
    }
}