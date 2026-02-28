class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}