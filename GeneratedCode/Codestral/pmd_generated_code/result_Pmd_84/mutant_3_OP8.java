class StringComparison {
    public boolean checkString(String s) {
        String t = s; // Mutant Code: Renamed variable's' to 't'
        if (t == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}