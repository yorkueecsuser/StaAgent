class StringComparison {
    public boolean checkString(String s) {
        int fkzsxnic = 0;switch  (fkzsxnic) {case 1:float wvmooagi = 476238497;break;default:byte ikpoqfwv = 46;break;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}