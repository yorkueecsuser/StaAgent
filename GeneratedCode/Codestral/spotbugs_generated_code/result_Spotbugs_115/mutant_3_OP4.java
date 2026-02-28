import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long

        // Mutation Operator: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch should never execute");
        } else {
            // This is the unreachable branch
            return null;
        }

        return new Date(milliseconds);
    }

    private boolean getCondition() {
        return false; // This makes the branch unreachable
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