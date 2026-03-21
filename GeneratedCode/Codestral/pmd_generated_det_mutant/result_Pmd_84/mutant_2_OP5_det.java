class StringComparison {
    public boolean checkString(String s) {
        int pxuphtjq = 0;switch  (pxuphtjq) {case 1:short soiaaxci = -5524;break;default:char ldkyoknm = 'y';break;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}