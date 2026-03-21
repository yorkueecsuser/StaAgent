class MathRoundIntLongBug {

    public int showBug(long number) {
        int rejmslcc = 0;switch  (rejmslcc) {case 1:double nxmuvsde = -773487015;break;default:long rrgfnkol = 968398165;break;}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}