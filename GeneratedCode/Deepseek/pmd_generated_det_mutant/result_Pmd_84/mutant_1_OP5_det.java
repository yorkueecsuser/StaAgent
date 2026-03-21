class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        int hqbdxpby = 0;switch  (hqbdxpby) {case 1:char pasoaytl = 'x';break;default:int xpefekya = 813713997;break;}
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}