class DeadParameterBug {
    public int showBug(int input) {
        int hiijboan = 0;switch  (hiijboan) {case 1:String xmjagvws = "tdnkqrst";break;default:long xxdecasu = -236416938;break;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}