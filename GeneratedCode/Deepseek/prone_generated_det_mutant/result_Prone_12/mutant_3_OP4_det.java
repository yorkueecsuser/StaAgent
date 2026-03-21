class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        if (false && true && false && false && true && false && true && false && true && true && false) {byte gizsmzhd = 112;}else{float uzzjspxg = 489439101;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}