import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            switch (seconds) {
                case 1:
                    System.out.println("This is an unreachable code block.");
                    break;
            }
        }

        return new Date(milliseconds);
    }

    // Rest of the code remains the same...
}