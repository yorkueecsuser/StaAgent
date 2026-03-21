class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        byte udxkfwpl = -41;
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}