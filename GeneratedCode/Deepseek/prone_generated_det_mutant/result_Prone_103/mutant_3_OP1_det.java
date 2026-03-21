class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        char jbildrxz = 'c';
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    
}
}