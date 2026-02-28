class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // Mutant Code: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            // unreachable code
        } else {
            return Float.compare(max, diff);
        }
        return 0; // to avoid compile error as all paths must return a value
    }
}