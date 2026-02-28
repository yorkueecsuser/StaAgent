import java.util.Date;

class TimeConversionBug {

    // Original bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long

        // Mutation: Unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            // This loop is unreachable as loopCondition is always false
            System.out.println("This line will never be executed");
        }

        return new Date(milliseconds);
    }

    // The rest of the code remains the same
    //...
}