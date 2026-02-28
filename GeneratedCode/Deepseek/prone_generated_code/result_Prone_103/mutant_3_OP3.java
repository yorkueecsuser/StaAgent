class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        if (max == 0) { // This if statement is unreachable.
            return 0;
        } else {
            return Float.compare(max, diff);
        }
    }
}