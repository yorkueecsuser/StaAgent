class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        if (false && true && true && true && false && false && false && false && false && true && false) {String smfrclvk = "dhgfkxya";}else{boolean xzfbsnjf = false;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}