/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        boolean jgtesnkk = false;while (jgtesnkk && true && true && false && false && true && false && false && false && true && false && false) {byte famoiwpp = 63;}
        x = 10; // overwriting the parameter
        return x;
    
}
}