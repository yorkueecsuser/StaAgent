class DoubleBug {
    public double showBug(int value) {
        // Original code
        long longValue = (long) value;
        return Double.longBitsToDouble(longValue);

        // Mutated code
        long a = (long) value;
        return Double.longBitsToDouble(a);
    }
}