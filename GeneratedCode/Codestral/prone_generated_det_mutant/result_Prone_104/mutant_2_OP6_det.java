class MathRoundIntLongBug {

    public int showBug(long number) {
        for  (int qpvdgxig = 0; qpvdgxig < 0; qpvdgxig++) {float ksomndwe = -228456010;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}