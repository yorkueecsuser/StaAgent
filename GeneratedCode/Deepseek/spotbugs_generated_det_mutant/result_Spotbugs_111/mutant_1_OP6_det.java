/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        for  (int vazwirhn = 0; vazwirhn < 0; vazwirhn++) {long iybpfyqt = 450482424;}
        x = 10; // overwriting the parameter
        return x;
    
}
}