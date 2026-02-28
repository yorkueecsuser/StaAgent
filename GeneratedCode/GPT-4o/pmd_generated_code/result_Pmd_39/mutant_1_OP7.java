class FloatLoopIndex {
    
    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Introducing an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This code is unreachable.");
        }

        return count; // This will return 0 due to the floating point precision issue.
    }

    // Method to return a false condition, making the while loop unreachable
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}