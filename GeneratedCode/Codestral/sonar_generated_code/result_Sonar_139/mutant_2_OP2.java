class DoubleBug {
    public double showBug(int value) {
        // Original code
        long longValue = (long) value;
        double result = Double.longBitsToDouble(longValue);

        // Mutant code
        // Duplicated assignment statement and inserted immediately after its current location
        long duplicatedValue = (long) value;
        double duplicatedResult = Double.longBitsToDouble(duplicatedValue);

        return result;
    }
}