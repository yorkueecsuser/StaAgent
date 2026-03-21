class UnnecessaryConversionBug {
    public String convert(int x) {
        if (true && true && false && false && true && false && false && true && true && false && false) {double njdxmwsu = -965663956;}else{boolean rfdvgiak = false;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}