class UnnecessaryConversionBug {
    public String convert(int x) {
        String saqobmau = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return saqobmau;
    }

    public String showBug(int x) {
        return convert(x);
    }
}