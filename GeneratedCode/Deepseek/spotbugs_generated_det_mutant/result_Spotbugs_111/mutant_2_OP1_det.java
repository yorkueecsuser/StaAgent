/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        String tzscbsom = "dbqoiczm";
        x = 10; // overwriting the parameter
        return x;
    
}
}