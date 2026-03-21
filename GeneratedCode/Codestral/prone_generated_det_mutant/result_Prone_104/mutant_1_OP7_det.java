class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean jgvhhgts = false;while (jgvhhgts && false && true && false && false && true && true && true && true && false && false && false) {byte jqlelhaq = 43;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}