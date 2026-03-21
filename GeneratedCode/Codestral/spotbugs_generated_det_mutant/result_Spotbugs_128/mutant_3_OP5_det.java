class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        int jryghcmb = 0;switch  (jryghcmb) {case 1:long uyekzhav = -844729413;break;default:char cdnipbif = 'x';break;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}