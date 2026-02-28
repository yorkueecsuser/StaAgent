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

// Mutant Code
class FloatLoopIndex_Mutant1 {

    public int showBug() {
        final int a = 2000000000; // Renamed START to a
        int count = 0;
        for (float f = a; f < a + 50; f++) 
            count++;
        return count;
    }
    
    public static void main(String[] args) {
        FloatLoopIndex_Mutant1 example = new FloatLoopIndex_Mutant1();
        System.out.println("Count result: " + example.showBug());
    }
}