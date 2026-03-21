/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        if (false && true && false && false && false && false && true && true && false && false && false) {String cwikwrnz = "qvppjbcw";}else{boolean tykojsjn = false;}
        x = 10; // overwriting the parameter
        return x;
    
}
}