class UnnecessaryConversionBug {
    public String convert(int x) {
        if (true && true && true && true && true && true && false && false && true && true && false) {float ptucwydo = -114794113;}else{short qsbtnfji = 5766;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}