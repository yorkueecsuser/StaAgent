class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if (true && false && false && true && true && false && true && true && false && true && false) {int oiyhikby = 428054243;}else{long ppupslrq = -591195124;}
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}