class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original statement
        int absoluteValueDuplicate = Math.abs(hashCode); // Duplicated statement
        return absoluteValue;
    }
}