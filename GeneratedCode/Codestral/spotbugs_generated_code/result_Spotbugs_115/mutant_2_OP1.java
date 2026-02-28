import java.util.Date;
import java.util.Random;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long
        int deadStoreVariable = generateRandomInt(); // Dead Store mutation: add unused variable
        return new Date(milliseconds);
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(1000000);
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