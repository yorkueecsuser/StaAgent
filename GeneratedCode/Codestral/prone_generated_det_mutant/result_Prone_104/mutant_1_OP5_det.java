class MathRoundIntLongBug {

    public int showBug(long number) {
        int jocjtzvr = 0;switch  (jocjtzvr) {case 1:int txbdmbij = -948749923;break;default:long vkvmnfyt = 594375062;break;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}