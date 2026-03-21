class MathRoundIntLongBug {

    public int showBug(long number) {
        if (false && true && false && true && true && false && false && true && true && false && false) {char qghkvkfh = 'x';}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}