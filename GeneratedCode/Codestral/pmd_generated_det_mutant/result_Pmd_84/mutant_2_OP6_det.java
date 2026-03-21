class StringComparison {
    public boolean checkString(String s) {
        for  (int ruedkogb = 0; ruedkogb < 0; ruedkogb++) {long qvexownq = -423787636;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}