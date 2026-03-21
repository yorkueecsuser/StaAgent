class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        if (false && false && true && false && true && false && false && false && false && false && false) {String vcyexjbq = "hqgrrqve";}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}