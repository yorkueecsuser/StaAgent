class StringComparison {
    public boolean checkString(String s) {
        byte gtzpebgp = -108;
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}