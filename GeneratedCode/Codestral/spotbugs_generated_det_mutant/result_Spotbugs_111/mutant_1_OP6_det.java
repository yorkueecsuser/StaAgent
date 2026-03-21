class DeadParameterBug {
    public int showBug(int input) {
        for  (int fnfisxnv = 0; fnfisxnv < 0; fnfisxnv++) {short ikvlefkg = -126;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}