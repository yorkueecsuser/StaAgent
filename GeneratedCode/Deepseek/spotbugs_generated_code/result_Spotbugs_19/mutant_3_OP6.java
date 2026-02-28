class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Mutation: Unreachable for loop
            System.out.println("This code will never be executed.");
        }
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    }

    // Helper method to avoid using compile-time constants
    private static boolean getCondition() {
        return false;
    }
}