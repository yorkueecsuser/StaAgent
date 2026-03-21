// Java code to demonstrate FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
class BuggyCode {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int showBug() {
        int awqifcwk = 0;switch  (awqifcwk) {case 1:short byvebpjv = -2102;break;default:long swrbgqzq = 604475589;break;}
        if (number!= 0) {
            return 100 / number; // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
                                 // SpotBugs should have generated a warning for potential division by zero
        }
        return 0;
    
}
}