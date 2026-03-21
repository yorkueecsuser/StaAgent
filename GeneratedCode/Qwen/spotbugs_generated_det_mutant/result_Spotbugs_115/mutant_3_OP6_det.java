import java.util.Date;

class IcastBugExample {

    // Method demonstrating the bug
    public Date showBug(int seconds) {
for  (int txufeipm = 0; txufeipm < 0; txufeipm++) {double wfgfugzk = -752676184;}

        return new Date(seconds * 1000); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    
}

    public static void main(String[] args) {
        IcastBugExample example = new IcastBugExample();
        System.out.println("Date for seconds 2000000000: " + example.showBug(2000000000)); // This will show an incorrect date
    }
}