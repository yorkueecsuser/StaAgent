class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 99999: // This case will never be executed
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case with no operation to ensure the switch is syntactically correct
                break;
        }

        return count; // This will return 0 due to the floating point precision issue.
    }
    
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}