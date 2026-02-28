import java.util.Date;

class TimeConversionBug {

    // Bug: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    public Date getMalformedDate(int sec) {
        long milliseconds = sec * 1000; // Renaming'seconds' to'sec'
        return new Date(milliseconds);
    }

    public void displayBug() {
        int futureSec = Integer.MAX_VALUE; // Renaming 'futureSeconds' to 'futureSec'
        Date malformedDate = getMalformedDate(futureSec);
        System.out.println("Malformed date for seconds=" + futureSec + ": " + malformedDate);
    }

    public static void main(String[] args) {
        TimeConversionBug bugDemo = new TimeConversionBug();
        bugDemo.displayBug(); // Renaming'showBug' to 'displayBug'
    }
}