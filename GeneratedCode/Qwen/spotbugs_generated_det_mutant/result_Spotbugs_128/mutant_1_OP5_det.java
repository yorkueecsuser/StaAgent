class IntShiftBug {

    public int showBug(int value) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << 32;
    }

    public int showBug2(int value) {
        int qmwnfkuz = 0;switch  (qmwnfkuz) {case 1:int rebduyqe = 23437230;break;default:short qupwdtcp = 3164;break;}
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value >> 40;
    
}

    public static void main(String[] args) {
        IntShiftBug bugDemo = new IntShiftBug();
        System.out.println("Result of showBug(1): " + bugDemo.showBug(1));  // Expected to be 1, but demonstrates the bug
        System.out.println("Result of showBug2(256): " + bugDemo.showBug2(256));  // Expected to be 1, but demonstrates the bug
    }
}