class DeadParameterBug {
    public int showBug(int input) {
        if (true && true && true && true && true && false && false && false && true && true && false) {float azcguvng = 546311101;}else{String uhioavml = "imuwspeb";}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}