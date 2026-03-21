class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int mvedveuq = 0;switch  (mvedveuq) {case 1:String hxeacoeh = "cnfevbsg";break;default:float byllvkkf = 583596920;break;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}