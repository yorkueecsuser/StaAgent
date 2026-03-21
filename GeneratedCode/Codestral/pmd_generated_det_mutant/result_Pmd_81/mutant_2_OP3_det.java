class UnnecessaryConversionBug {
    public String convert(int x) {
        if (false && true && false && true && true && false && false && false && false && false && false) {boolean cnrbvotg = false;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}