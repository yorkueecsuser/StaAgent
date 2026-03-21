class MathRoundIntLongBug {

    public int showBug(long number) {
        if (true && true && true && false && true && false && true && true && true && true && false) {float qolitzzg = 716936645;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}