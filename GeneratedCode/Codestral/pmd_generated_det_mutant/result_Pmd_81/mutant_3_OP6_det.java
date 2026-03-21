class UnnecessaryConversionBug {
    public String convert(int x) {
        for  (int nouhasxh = 0; nouhasxh < 0; nouhasxh++) {String tgjssubc = "ewtfnkkd";}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}