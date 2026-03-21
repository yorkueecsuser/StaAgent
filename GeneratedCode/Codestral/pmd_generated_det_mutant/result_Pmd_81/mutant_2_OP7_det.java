class UnnecessaryConversionBug {
    public String convert(int x) {
        boolean vndrwhjz = false;while (vndrwhjz && false && false && false && true && true && false && true && false && false && true && false) {float iepwrfgc = 35118858;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}