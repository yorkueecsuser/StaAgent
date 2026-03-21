/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        short cwzekqyd = 9660;
        x = 10; // overwriting the parameter
        return x;
    
}
}