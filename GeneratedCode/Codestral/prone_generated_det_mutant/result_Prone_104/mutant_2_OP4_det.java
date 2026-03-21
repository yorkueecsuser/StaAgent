class MathRoundIntLongBug {

    public int showBug(long number) {
        if (true && true && false && true && false && true && false && false && true && false && false) {char fnhbsnzq = 'h';}else{String edwrcdxp = "ywdifeuc";}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}