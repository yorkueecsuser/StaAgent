class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        
        // Unreachable switch statement mutant
        // Using a callable method to simulate an unreachable switch
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be reached
                System.out.println("This statement is unreachable.");
                break;
            default:
                // No operation here, as it's intended to be unreachable
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        // Returning a value that will never match any case in the switch
        return -1;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}