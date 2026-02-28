class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}

// Mutated version with a renamed variable
class FloatLoopIndexMutant {

    public int showBug() {
        final int s = 2000000000; // START renamed to s
        int count = 0;
        for (float f = s; f < s + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndexMutant example = new FloatLoopIndexMutant();
        System.out.println("Count result: " + example.showBug());
    }
}