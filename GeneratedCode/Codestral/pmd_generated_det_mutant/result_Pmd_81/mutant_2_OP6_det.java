class UnnecessaryConversionBug {
    public String convert(int x) {
        for  (int lseyyixm = 0; lseyyixm < 0; lseyyixm++) {String rnnmslld = "vidfafbl";}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}