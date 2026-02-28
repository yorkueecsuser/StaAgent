class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Insert an unreachable if-else statement using a dynamically evaluated condition
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is also never executed.");
        }
        
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    private boolean getUnreachableCondition() {
        // This method always returns false, but it's evaluated at runtime
        return false;
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}