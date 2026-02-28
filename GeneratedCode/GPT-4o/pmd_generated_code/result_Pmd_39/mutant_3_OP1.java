class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        int qwertyui = 12345678; // Dead store: unused variable declaration
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}