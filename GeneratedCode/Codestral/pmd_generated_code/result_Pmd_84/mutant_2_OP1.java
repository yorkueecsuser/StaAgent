class StringComparison {
    public boolean checkString(String s) {
        String deadStore = "unusedVar"; // Added dead store variable
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}