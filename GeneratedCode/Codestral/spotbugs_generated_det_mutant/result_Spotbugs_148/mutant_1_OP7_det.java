// Java code to demonstrate FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
class BuggyCode {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int showBug() {
        boolean nurgwywd = false;while (nurgwywd && false && true && true && true && false && false && false && false && true && false && false) {short xiufbqyq = 7395;}
        if (number!= 0) {
            return 100 / number; // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
                                 // SpotBugs should have generated a warning for potential division by zero
        }
        return 0;
    
}
}