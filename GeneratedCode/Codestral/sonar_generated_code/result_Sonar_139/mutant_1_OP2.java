class DoubleBug {
    public double showBug(int value) {
        // Original code
        double originalValue = Double.longBitsToDouble(value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit

        // Mutant code: duplicate the assignment statement
        double mutatedValue = Double.longBitsToDouble(value); // Duplicated statement

        // Return the original value
        return originalValue;
    }
}