class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        int qyvowkmy = 0;switch  (qyvowkmy) {case 1:boolean pabyxiun = false;break;default:byte whjtwjbo = 115;break;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}