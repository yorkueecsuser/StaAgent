class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        if (true && true && false && false && true && true && true && false && false && true && false) {String xkoxmekl = "hqlbvoux";}else{int mexxivpn = 357844409;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}