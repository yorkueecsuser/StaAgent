class DeadParameterBug {
    public int showBug(int input) {
        boolean rdhxgjxg = false;while (rdhxgjxg && false && false && false && true && true && true && true && true && true && false && false) {int qfetkbzo = -474462332;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}