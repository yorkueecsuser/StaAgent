class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        long efijfgso = 920395379;
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}