class MathRoundIntLongBug {

    public int showBug(long number) {
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    }
}