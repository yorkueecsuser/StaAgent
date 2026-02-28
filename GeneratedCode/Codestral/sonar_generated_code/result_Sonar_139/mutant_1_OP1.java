class DoubleBug {
    public double showBug(int value) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        // Mutation: Dead Store
        int unusedVariable = 0; // Added dead store variable

        return Double.longBitsToDouble(value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }
}