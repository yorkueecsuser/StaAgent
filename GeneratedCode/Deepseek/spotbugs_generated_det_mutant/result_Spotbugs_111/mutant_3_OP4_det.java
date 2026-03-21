/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        if (false && false && false && true && true && false && true && true && false && true && false) {boolean plwhdkuw = true;}else{short zdakpbbu = -5039;}
        x = 10; // overwriting the parameter
        return x;
    
}
}