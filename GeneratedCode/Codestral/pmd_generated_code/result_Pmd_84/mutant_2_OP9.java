class StringComparison {
    public boolean checkString(String s) {
        if (s!= "one") return true; // Mutated Bug: UseEqualsToCompareStrings
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}