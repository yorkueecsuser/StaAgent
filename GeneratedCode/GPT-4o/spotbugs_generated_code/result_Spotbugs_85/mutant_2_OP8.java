class BitMaskBugExample {

    public boolean compareMasks(int v, int m, int n) { // Renamed variables: value -> v, mask1 -> m, mask2 -> n
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (v & m) == n; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int v, int m, int n) { // Renamed variables: value -> v, mask1 -> m, mask2 -> n
        return compareMasks(v, m, n);
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}