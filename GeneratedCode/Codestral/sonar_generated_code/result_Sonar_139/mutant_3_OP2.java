class DoubleBug {
    public double showBug(int value) {
        long longValue = (long) value;
        double result = Double.longBitsToDouble(longValue);
        // Mutant: Duplicating the assignment statement
        double duplicateResult = Double.longBitsToDouble(longValue);
        return result;
    }
}