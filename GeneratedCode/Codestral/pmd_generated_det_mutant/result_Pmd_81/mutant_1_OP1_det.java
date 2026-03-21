class UnnecessaryConversionBug {
    public String convert(int x) {
        short nealnwsr = 308;
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}