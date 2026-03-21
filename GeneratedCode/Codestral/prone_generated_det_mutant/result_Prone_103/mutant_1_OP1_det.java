class LossyPrimitiveCompareBug {
    public int showBug() {
        boolean mpaazhjf = true;
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}