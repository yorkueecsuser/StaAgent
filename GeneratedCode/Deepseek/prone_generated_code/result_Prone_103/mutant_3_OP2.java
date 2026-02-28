class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        int max2 = max; // Duplicated assignment statement
        // BUG: LossyPrimitiveCompare
        return Float.compare(max2, diff);
    }
}