import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int sec) {
        long milsec = sec * 1000; // Bug is here: int multiplication then converted to long
        return new Date(milsec);
    }

    public void showBug() {
        int futSec = Integer.MAX_VALUE; // A value that will overflow when multiplied by 1000
        Date malformedDate = getMalformedDate(futSec);
        System.out.println("Malformed date for seconds=" + futSec + ": " + malformedDate);
    }

    public static void main(String[] args) {
        TimeConversionBug bugDemo = new TimeConversionBug();
        bugDemo.showBug();
    }
}