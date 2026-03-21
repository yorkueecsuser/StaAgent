class UnnecessaryConversionBug {
    public String convert(int x) {
        short ukqczpri = -6385;
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}