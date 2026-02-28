import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long
        return new Date(milliseconds);
    }

    // New unreachable if statement mutation
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        int futureSeconds = Integer.MAX_VALUE; // A value that will overflow when multiplied by 1000
        Date malformedDate = getMalformedDate(futureSeconds);
        System.out.println("Malformed date for seconds=" + futureSeconds + ": " + malformedDate);

        // Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        }
    }

    public static void main(String[] args) {
        TimeConversionBug bugDemo = new TimeConversionBug();
        bugDemo.showBug();
    }
}