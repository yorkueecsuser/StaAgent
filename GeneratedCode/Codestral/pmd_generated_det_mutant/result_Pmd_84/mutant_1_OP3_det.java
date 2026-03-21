class StringComparison {
    public boolean checkString(String s) {
        if (true && false && true && true && false && false && true && true && false && true && false) {long iaacfybz = -776476392;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}