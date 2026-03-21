class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        if (true && false && false && true && true && false && false && true && true && true && false) {short gtoknmel = 7603;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}