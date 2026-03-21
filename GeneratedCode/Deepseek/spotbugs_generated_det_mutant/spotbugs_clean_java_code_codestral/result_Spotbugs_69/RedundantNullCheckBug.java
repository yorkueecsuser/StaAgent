class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        // Mutant code: Equivalent Loop Replacement
        do {
            if (sb!= null) {
                return sb.toString();
            }
        } while (false);
        return null;
    }
}