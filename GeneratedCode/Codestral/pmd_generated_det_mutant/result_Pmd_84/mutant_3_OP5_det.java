class StringComparison {
    public boolean checkString(String s) {
        int sgvrundq = 0;switch  (sgvrundq) {case 1:int aoyobtna = 856961734;break;default:long jspgpxrt = 314959417;break;}
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    
}

    public boolean showBug(String s) {
        return checkString(s);
    }
}