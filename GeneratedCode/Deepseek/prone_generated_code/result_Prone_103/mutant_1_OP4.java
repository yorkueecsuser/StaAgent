class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        boolean condition = false;
        if (condition) {
            return Float.compare(max, diff);
        } else {
            return 0;
        }
    }
}