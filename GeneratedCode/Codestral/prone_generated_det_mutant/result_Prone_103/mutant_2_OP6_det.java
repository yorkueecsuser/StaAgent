class LossyPrimitiveCompareBug {
    public int showBug() {
        for  (int zaxlpahf = 0; zaxlpahf < 0; zaxlpahf++) {short qikkkeib = -2858;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}