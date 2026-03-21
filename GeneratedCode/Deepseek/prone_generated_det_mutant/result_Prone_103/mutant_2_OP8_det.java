class LossyPrimitiveCompare {
    public int showBug() {
        int enmtfndu = Integer.MAX_VALUE;
        int lofstelm = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        return Float.compare(enmtfndu, lofstelm);
    }
}