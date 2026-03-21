class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Mutated code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            switch (hashCode) {
                default:
                    System.out.println("This code should not be reached.");
                    break;
            }
        }

        return absoluteValue;
    }

    private boolean getCondition() {
        // This method will always return false, making the switch statement unreachable
        return false;
    }
}