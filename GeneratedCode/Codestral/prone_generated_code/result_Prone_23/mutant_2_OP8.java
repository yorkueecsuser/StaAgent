class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // Original code
        byte v = value;
        return v == 200;
    }
}