/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        int fxiujifr = 0;switch  (fxiujifr) {case 1:boolean skzoxzxk = true;break;default:byte svmnxnvz = 123;break;}
        x = 10; // overwriting the parameter
        return x;
    
}
}