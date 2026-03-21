class LossyPrimitiveCompareBug {
    public int showBug() {
        byte hmwilfaa = -6;
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}