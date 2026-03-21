class HashCodeBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Mutant: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        } else {
            // Do nothing
        }

        return absoluteValue;
    }
}