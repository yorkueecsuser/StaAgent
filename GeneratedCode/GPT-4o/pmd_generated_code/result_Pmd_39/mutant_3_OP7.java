class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        boolean conditionWhile = getCondition(); // Dynamic condition for while loop
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
        
        return count; // This will return 0 due to the floating point precision issue.
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }

    // Helper method to ensure non-constant loop condition
    private boolean getCondition() {
        return false; // Ensuring the while loop is never entered
    }
}