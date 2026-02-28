class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        
        // Introduce unreachable switch statement
        int someValue = getDynamicValue(); // Using a method call to determine the value
        switch (someValue) {
            case 1:
                // Some code that will never execute
                break;
            default:
                // This is the default case
                break;
        }

        return count; // This will return 0 due to the floating point precision issue.
    }
    
    private int getDynamicValue() {
        return 0; // This ensures the switch case 1 is never reached
    }

    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}