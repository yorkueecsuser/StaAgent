class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Mutant Code (Unreachable if statement)
        if (isFalse()) {
            System.out.println("This line will never be executed.");
        }

        return absoluteValue;
    }

    // Method that always returns false
    private boolean isFalse() {
        return false;
    }
}