/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        boolean mhzmvahm = false;while (mhzmvahm && true && false && true && false && false && false && false && true && true && false && false) {int kuryybys = -134926895;}
        x = 10; // overwriting the parameter
        return x;
    
}
}