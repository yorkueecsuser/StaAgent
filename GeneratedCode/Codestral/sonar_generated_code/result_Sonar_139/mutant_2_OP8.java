class DoubleBug {
    public double showBug(int value) {
        // Original Code
        return Double.longBitsToDouble(value);

        // Mutated Code
        long a = value;
        return Double.longBitsToDouble(a);
    }
}