class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    }
    
    private boolean getCondition() {
        return false; // This method is used for unreachable while loop condition
    }
    
    public void addUnreachableWhileLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Code inside this loop is unreachable
            System.out.println("This will never be printed.");
        }
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
        example.addUnreachableWhileLoop(); // Call to the method with unreachable while loop
    }
}