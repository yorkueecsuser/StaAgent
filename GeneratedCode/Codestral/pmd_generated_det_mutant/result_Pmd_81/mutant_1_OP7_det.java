class UnnecessaryConversionBug {
    public String convert(int x) {
        boolean pouhrobo = false;while (pouhrobo && true && true && true && true && false && true && true && false && true && true && false) {String ujmneecd = "oodhvion";}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}