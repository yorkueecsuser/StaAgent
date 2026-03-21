class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        int wokfxugg = 0;switch  (wokfxugg) {case 1:byte urxyjhso = -10;break;default:long utvjsnty = -61828015;break;}
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}