class StringComparison {
    public boolean checkString(String s) {
        for  (int vomnrdxw = 0; vomnrdxw < 0; vomnrdxw++) {boolean nzyuyrhr = false;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}