class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Introduce an unreachable if-else statement using a non-final variable
        boolean isUnreachable = calculateUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is also unreachable.");
        }

        return count; // This will return 0 due to the floating point precision issue.
    }

    private boolean calculateUnreachableCondition() {
        // This method determines the condition dynamically
        return false;
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}