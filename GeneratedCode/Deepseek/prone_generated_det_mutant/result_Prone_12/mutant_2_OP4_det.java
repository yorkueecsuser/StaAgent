class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        if (false && true && true && false && false && false && true && false && true && true && false) {byte uvqdkrun = -30;}else{float gortvtrm = 646959050;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}