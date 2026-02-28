class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code would never be executed
            System.out.println("This is an unreachable while loop");
        }

        return absoluteValue;
    }
}