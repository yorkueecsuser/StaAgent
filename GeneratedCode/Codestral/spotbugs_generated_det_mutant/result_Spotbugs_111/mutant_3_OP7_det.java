class DeadParameterBug {
    public int showBug(int input) {
        boolean wecvztud = false;while (wecvztud && true && true && true && true && true && false && false && false && false && false && false) {String qzygstgd = "elyeohsq";}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}