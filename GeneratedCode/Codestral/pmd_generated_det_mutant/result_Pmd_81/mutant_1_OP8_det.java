class UnnecessaryConversionBug {
    public String convert(int x) {
        String hikzautt = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return hikzautt;
    }

    public String showBug(int x) {
        return convert(x);
    }
}