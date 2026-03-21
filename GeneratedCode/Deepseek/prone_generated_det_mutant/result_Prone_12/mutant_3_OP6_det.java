class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        for  (int hzibnoys = 0; hzibnoys < 0; hzibnoys++) {float quybrjra = -621153761;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}