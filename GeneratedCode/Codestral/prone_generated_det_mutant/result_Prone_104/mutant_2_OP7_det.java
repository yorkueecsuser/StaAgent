class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean tcodvbug = false;while (tcodvbug && true && false && true && true && false && false && false && true && false && false && false) {short vhlksznr = -8044;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}