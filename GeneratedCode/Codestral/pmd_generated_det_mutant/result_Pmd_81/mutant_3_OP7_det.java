class UnnecessaryConversionBug {
    public String convert(int x) {
        boolean azrnfqdc = false;while (azrnfqdc && false && true && false && false && false && false && false && true && true && false && false) {float exeshgza = -912281086;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}