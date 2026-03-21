/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        if (true && false && false && true && true && true && false && false && true && false && false) {byte ascmtlph = -102;}else{short dqmpbmli = -9643;}
        x = 10; // overwriting the parameter
        return x;
    
}
}