class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            result = 0;
        } else {
            // This else block is unreachable, but still compiles successfully
            int value = 10;
            value = value + 5;
        }

        return result;
    }
}