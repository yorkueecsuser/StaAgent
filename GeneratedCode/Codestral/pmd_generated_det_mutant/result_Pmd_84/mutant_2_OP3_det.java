class StringComparison {
    public boolean checkString(String s) {
        if (false && false && true && true && true && true && false && true && true && true && false) {long kkhjwiac = -484622698;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}