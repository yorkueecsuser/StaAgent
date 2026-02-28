class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
        // Duplication Mutation Operator
        max = Integer.MAX_VALUE;
    }
}