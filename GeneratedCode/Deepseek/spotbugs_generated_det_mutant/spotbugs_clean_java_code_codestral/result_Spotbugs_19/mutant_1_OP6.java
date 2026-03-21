class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original bug is maintained here

        // Mutated code: Unreachable for loop
        boolean isFalse = false;
        for (int i = 0; isFalse; i++) { // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }

        return absoluteValue;
    }
}