class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original bug

        boolean conditionWhile = false; // Dynamically determined condition for the while loop
        while (conditionWhile) { // Unreachable while loop inserted
            System.out.println("This line will never be executed.");
        }

        return absoluteValue;
    }
}