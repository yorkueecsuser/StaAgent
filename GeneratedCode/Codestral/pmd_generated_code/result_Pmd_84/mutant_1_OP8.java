class StringComparison {
    public boolean checkString(String s) {
        String n = s;
        if (n == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}