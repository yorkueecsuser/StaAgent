class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        for  (int quckgxfc = 0; quckgxfc < 0; quckgxfc++) {float tejvhkka = -549185423;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}