class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        if (false && false && true && false && false && true && false && true && false && false && false) {byte jzmznqfs = -66;}else{char ilgyrvrn = 'o';}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}