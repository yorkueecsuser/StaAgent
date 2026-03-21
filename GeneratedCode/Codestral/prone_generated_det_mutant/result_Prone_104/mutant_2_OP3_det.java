class MathRoundIntLongBug {

    public int showBug(long number) {
        if (false && true && true && true && true && true && true && false && true && false && false) {boolean rrwsaqlz = false;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}