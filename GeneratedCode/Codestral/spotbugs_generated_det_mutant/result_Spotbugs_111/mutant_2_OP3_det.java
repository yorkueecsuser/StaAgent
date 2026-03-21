class DeadParameterBug {
    public int showBug(int input) {
        if (true && true && true && false && true && false && true && false && false && true && false) {byte zbhjaxfh = 18;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}