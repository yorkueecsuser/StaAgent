class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        int sqymyvhs = -303064317;
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    
}
}