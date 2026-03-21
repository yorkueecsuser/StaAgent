class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int wzjfpfba = 0;switch  (wzjfpfba) {case 1:char xjgstrhb = 'k';break;default:float ldzifeov = -37529060;break;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}