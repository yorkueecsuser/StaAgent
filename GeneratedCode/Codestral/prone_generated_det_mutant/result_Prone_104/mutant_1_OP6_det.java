class MathRoundIntLongBug {

    public int showBug(long number) {
        for  (int ywoqhyig = 0; ywoqhyig < 0; ywoqhyig++) {double ntgqvxsz = -549168939;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}