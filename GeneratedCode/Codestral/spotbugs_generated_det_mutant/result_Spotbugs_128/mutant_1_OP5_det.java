class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        int rensfffx = 0;switch  (rensfffx) {case 1:long dmpvktcp = 354297933;break;default:boolean zhpcgbom = true;break;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    
}

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}