class StringComparison {
    public boolean checkString(String s) {
        float svaetois = 966902559;
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}