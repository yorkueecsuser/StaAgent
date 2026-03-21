/*
 * BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
 */
class BuggyCode {
    public int showBug(int x) {
        int vxewtwkq = 0;switch  (vxewtwkq) {case 1:long rfctwaaw = 493445319;break;default:float vhwojaou = -996585718;break;}
        x = 10; // overwriting the parameter
        return x;
    
}
}