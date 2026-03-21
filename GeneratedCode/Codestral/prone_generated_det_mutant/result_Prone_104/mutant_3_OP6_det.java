class MathRoundIntLongBug {

    public int showBug(long number) {
        for  (int aqqdrnec = 0; aqqdrnec < 0; aqqdrnec++) {char eseqneyp = 'x';}
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    
}
}