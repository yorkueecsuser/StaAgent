class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean qwwifknj = false;while (qwwifknj && true && false && true && true && true && false && true && true && true && true && false) {String jgeonkzf = "hvwndqxn";}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}