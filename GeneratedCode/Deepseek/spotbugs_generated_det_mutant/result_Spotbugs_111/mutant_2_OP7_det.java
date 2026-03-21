/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        boolean sigiqbms = false;while (sigiqbms && true && true && false && false && true && false && false && true && false && true && false) {short vumdwvyv = 3641;}
        x = 10; // overwriting the parameter
        return x;
    
}
}