class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int rrjhrvrc = 0;switch  (rrjhrvrc) {case 1:byte insexbsd = 84;break;default:char xsmciyql = 's';break;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}