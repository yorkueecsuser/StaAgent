class MathRoundIntLongBug {

    public int showBug(long number) {
        int zmmnwvcp = 0;switch  (zmmnwvcp) {case 1:long rndgaqoq = -313397311;break;default:short meuqzpsh = 8334;break;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}