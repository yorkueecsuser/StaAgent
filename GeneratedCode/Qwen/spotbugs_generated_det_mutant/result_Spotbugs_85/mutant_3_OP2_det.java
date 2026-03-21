class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }
    }
public static void main(String [] args){
    BitMaskBug bugDemo = new BitMaskBug();
    bugDemo = new BitMaskBug();
    System.out.println(bugDemo.showBug(0b1100));
}
}