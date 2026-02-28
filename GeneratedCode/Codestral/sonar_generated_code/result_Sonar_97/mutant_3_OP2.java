class AbsBug {
    public int showBug(String str) {
        int hashCode = str.hashCode();
        return Math.abs(hashCode); // Duplicated assignment statement
        int duplicatedHashCode = hashCode; // Mutant code added
    }
}