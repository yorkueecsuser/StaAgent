class UnnecessaryConversionBug {
    public String convert(int x) {
        int mpmnjyis = 0;switch  (mpmnjyis) {case 1:int zwoupxpx = -937641635;break;default:float xrhotixs = 509958770;break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    public String showBug(int x) {
        return convert(x);
    }
}