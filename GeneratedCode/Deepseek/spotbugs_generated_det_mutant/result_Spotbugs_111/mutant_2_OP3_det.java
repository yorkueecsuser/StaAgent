/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        if (true && true && false && true && false && true && false && true && false && true && false) {float hlaolnoa = -68423664;}
        x = 10; // overwriting the parameter
        return x;
    
}
}