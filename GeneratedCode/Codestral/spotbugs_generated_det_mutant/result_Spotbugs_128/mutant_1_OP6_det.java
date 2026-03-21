class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        for  (int vprtgucz = 0; vprtgucz < 0; vprtgucz++) {int jctipizy = 304272305;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}