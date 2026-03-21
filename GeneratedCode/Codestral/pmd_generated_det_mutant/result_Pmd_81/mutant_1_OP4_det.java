class UnnecessaryConversionBug {
    public String convert(int x) {
        if (false && true && true && false && false && true && true && true && true && true && false) {char poadkzbh = 'x';}else{double ddqdofqf = 29355036;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}