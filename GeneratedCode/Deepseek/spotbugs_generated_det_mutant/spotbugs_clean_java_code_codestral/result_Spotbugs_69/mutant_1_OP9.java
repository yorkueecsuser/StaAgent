class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        // Mutant: Removed the redundant null check
        return sb.toString();
    }
}