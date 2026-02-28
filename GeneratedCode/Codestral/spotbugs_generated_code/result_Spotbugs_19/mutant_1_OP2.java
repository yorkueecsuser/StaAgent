class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original bug
        int duplicateAbsoluteValue = Math.abs(hashCode); // Mutant: Duplicated assignment statement
        return absoluteValue;
    }
}