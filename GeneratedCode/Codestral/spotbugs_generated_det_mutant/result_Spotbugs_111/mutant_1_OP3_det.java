class DeadParameterBug {
    public int showBug(int input) {
        if (false && false && false && false && true && true && true && true && false && true && false) {short pwzdbdlj = -5900;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}