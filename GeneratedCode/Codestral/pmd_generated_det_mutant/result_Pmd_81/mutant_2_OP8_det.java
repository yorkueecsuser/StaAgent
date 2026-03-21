class UnnecessaryConversionBug {
    public String convert(int x) {
        String ozdbqycx = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return ozdbqycx;
    }

    public String showBug(int x) {
        return convert(x);
    }
}