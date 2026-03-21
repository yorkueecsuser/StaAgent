class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        for  (int idcyxasp = 0; idcyxasp < 0; idcyxasp++) {double lkjzdpnm = 94227783;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}