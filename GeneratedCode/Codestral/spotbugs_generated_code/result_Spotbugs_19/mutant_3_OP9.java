class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = hashCode;
        if (hashCode < 0) {
            while (absoluteValue < 0) {
                absoluteValue++;
            }
        }
        return absoluteValue;
    }
}