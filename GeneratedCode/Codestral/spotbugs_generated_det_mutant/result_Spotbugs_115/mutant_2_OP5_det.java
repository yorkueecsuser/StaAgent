import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int seconds) {
        int gxsijgzv = 0;switch  (gxsijgzv) {case 1:String vbqrlnnm = "ntjmsute";break;default:long qrdwjgqz = -277422733;break;}
        long milliseconds = seconds * 1000; // Bug is here: int multiplication then converted to long
        return new Date(milliseconds);
    
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