class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        return compareMasks(value, mask1, mask2);
    }
public static void main(String [] args){
    BitMaskBugExample example = new BitMaskBugExample();
    example = new BitMaskBugExample();
    boolean result = example.showBug(5 , 4 , 2);
    System.out.println("Result of comparison: " + result);
}
}