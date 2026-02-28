class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) { // BUG: DontUseFloatTypeForLoopIndices
            count++;
            // Mutant code: Unreachable if-else statement
            if (isFalseCondition()) {
                // This block is unreachable as isFalseCondition() always returns false
                System.out.println("Unreachable code executed!");
            } else {
                // This block can be executed
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }

    // Helper method to return a false condition
    private static boolean isFalseCondition() {
        return false;
    }
}