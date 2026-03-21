class MathRoundIntLongBug {

    public int showBug(long number) {
        if (true && false && false && false && false && true && false && false && true && true && false) {String tlyxloww = "kbdoqkgn";}else{byte jlrarrmb = -113;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}