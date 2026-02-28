class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int maxInt = Integer.MAX_VALUE;
        return Float.compare(maxInt, maxInt - 1);
    }
}