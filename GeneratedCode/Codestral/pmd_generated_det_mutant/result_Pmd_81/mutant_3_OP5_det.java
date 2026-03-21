class UnnecessaryConversionBug {
    public String convert(int x) {
        int hkdcynng = 0;switch  (hkdcynng) {case 1:byte vhjmlscg = 106;break;default:long axvicwuo = -628501046;break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}