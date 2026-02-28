class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int r = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        return r;
    }
}