class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        { float f = START; do { // BUG: DontUseFloatTypeForLoopIndices
            count++; f++; } while (f < START + 50); }
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}