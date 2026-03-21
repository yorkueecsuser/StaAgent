class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        int yxoikhjz = 0;switch  (yxoikhjz) {case 1:boolean grtdvtlz = false;break;default:byte krgksmsw = 95;break;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}