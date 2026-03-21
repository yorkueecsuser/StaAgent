class LossyPrimitiveCompareBug {
    public int showBug() {
        long hwfoucmo = 870171095;
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}