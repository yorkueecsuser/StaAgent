class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Mutation Operator: Inserting unreachable if statement
        boolean condition = getUnreachableCondition(); // This method will always return false
        if (condition) {
            System.out.println("This will never be printed.");
        }

        return count; // This will return 0 due to the floating point precision issue.
    }
    
    // Method to ensure the if statement is always false dynamically
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}