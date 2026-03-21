class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        int szfgobvv = 0;switch  (szfgobvv) {case 1:double zzegxbyq = -51442020;break;default:int ygxgqogg = 978199372;break;}
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}