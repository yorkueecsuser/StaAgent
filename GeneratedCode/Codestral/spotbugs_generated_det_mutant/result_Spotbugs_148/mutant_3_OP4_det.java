// Java code to demonstrate FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
class BuggyCode {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int showBug() {
        if (true && false && false && false && true && false && true && false && true && false && false) {double ucqpudtm = -150106381;}else{float ygzxcuxa = 82026356;}
        if (number!= 0) {
            return 100 / number; // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
                                 // SpotBugs should have generated a warning for potential division by zero
        }
        return 0;
    
}
}