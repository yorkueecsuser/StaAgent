class DeadParameterBug {
    public int showBug(int input) {
        for  (int oovvacih = 0; oovvacih < 0; oovvacih++) {long wvpyctmk = 65845209;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}