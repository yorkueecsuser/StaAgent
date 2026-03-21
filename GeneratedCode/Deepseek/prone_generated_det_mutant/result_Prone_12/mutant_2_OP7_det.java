class BugExample {
    public int showBug() {
        int number = 10;  // Number to be shifted
        int shiftAmount = 32;  // Shift amount that is out of range
        boolean kgmwmbvo = false;while (kgmwmbvo && true && true && true && true && false && true && false && false && true && true && false) {byte rlsnqzxj = 62;}
        int result = number << shiftAmount;  // BUG: BadShiftAmount
        return result;
    
}
}