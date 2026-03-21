class DeadParameterBug {
    public int showBug(int input) {
        boolean qdshavkw = false;while (qdshavkw && false && true && true && true && true && false && false && false && false && false && false) {byte tecymvkt = -71;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}