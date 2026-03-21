/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        if (false && false && false && false && false && false && true && false && false && false && false) {long meiomtbg = -321420597;}
        x = 10; // overwriting the parameter
        return x;
    
}
}