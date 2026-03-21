class UnnecessaryConversionBug {
    public String convert(int x) {
        if (true && true && false && false && true && true && false && true && true && true && false) {long ajvmgyvs = 559231233;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}