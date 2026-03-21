class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        if (false && false && true && true && true && true && false && true && true && true && false) {char vvtvxxiu = 'j';}else{double imzdbkup = -67537037;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}