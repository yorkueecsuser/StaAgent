class DeadParameterBug {
    public int showBug(int input) {
        if (false && true && true && true && true && true && false && true && false && false && false) {float auutdnrq = -880994895;}else{byte lrrmodcy = 119;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}