/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        int mxjuggvq = 0;switch  (mxjuggvq) {case 1:boolean mbcqmxyp = true;break;default:boolean fpzlldid = true;break;}
        x = 10; // overwriting the parameter
        return x;
    
}
}