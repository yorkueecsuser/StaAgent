class LossyPrimitiveCompareMutant1 {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int renamed = Integer.MAX_VALUE - 1;
        // MUTANT: Renaming
        return Float.compare(max, renamed);
    }
}