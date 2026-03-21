class UnnecessaryConversionBug {
    public String convert(int x) {
        for  (int xjptueyr = 0; xjptueyr < 0; xjptueyr++) {String uuoqyviv = "cnycshny";}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}