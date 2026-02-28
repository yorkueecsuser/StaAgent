class BitMaskBugExample {

    public boolean compareMasks(int p, int q, int r) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (p & q) == r; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int a, int b, int c) {
        return compareMasks(a, b, c);
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}