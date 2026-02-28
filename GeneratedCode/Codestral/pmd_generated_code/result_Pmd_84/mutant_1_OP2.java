class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") { // BUG: UseEqualsToCompareStrings
            s = "one"; // Added mutant
            return true;
        }
        if (s == "one") { // Duplicated statement
            return true;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}