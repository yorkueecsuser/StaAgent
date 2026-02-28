class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Unreachable if statement mutation
        boolean condition = getCondition(); 
        if (condition) {
            System.out.println("This is an unreachable block.");
        }
        
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    // Method to provide a dynamic condition at runtime
    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}