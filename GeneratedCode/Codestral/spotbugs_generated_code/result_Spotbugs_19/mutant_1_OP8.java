class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absVal = Math.abs(hashCode); // Renamed variable for mutation
        return absVal; // Return the renamed variable
    }
}