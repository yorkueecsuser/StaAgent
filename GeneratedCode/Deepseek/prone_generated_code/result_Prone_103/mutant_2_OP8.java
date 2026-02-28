class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // MUTANT: Renaming
        return Float.compare(a, diff);
    }
}