class IntShiftBug {

    public int showBug(int value) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << 32;
    }

    public int showBug2(int value) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value >> 40;
    }
public static void main(String [] args){
    IntShiftBug bugDemo = new IntShiftBug();
    bugDemo = new IntShiftBug();
    System.out.println("Result of showBug(1): " + bugDemo.showBug(1));
    System.out.println("Result of showBug2(256): " + bugDemo.showBug2(256));
}
}