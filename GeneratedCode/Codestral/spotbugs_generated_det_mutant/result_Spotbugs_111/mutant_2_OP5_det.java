class DeadParameterBug {
    public int showBug(int input) {
        int rbqbowei = 0;switch  (rbqbowei) {case 1:byte fhwimnlw = -83;break;default:float segraflm = 177268247;break;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}