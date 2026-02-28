class AbsBug {
    public int showBug(String str) {
        int hash = str.hashCode();
        return Math.abs(hash);
        // Mutant added: Duplicate the assignment statement
        int hashDuplicate = hash;
    }
}