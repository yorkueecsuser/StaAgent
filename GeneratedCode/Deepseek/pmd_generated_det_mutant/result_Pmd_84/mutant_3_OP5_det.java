class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        int ibeyjuzx = 0;switch  (ibeyjuzx) {case 1:short xiotlujp = 4616;break;default:boolean bsgdacte = true;break;}
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}