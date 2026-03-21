class UnnecessaryConversionBug {
    public String convert(int x) {
        int kftpdshf = 0;switch  (kftpdshf) {case 1:double etvgdunx = 550886429;break;default:byte qncdtkhi = 8;break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}