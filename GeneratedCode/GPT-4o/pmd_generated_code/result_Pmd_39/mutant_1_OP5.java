class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Adding unreachable switch statement
        int unreachableSwitchVariable = getUnreachableCondition();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                break;
        }

        return count; // This will return 0 due to the floating point precision issue.
    }
    
    // Method to provide a non-final variable for unreachable switch statement
    private int getUnreachableCondition() {
        return 0;
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}