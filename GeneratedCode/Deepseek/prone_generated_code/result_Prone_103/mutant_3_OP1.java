class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // Additional dead store
        int unusedVariable = 0;
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    }
}