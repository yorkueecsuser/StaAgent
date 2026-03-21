class StringComparison {
    public boolean checkString(String s) {
        if (false && false && true && true && false && false && false && false && true && false && false) {byte fzypzkiz = 99;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}