class DeadParameterBug {
    public int showBug(int input) {
        if (false && true && true && true && true && true && false && false && true && false && false) {double ndbhyget = -278722100;}else{boolean ljzgmmvu = true;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}