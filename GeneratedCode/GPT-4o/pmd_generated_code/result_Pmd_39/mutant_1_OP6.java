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

    // Additional method to generate a dynamic condition
    private boolean getCondition() {
        return false;
    }
    
    // Unreachable for loop inserted as per mutation operator
    public void unreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block will be unreachable
            System.out.println("This line will never be printed.");
        }
    }
}