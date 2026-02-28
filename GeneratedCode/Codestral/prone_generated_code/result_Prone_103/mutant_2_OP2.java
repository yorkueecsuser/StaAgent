class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int originalResult = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        // Mutant: Duplication
        int duplicateResult = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        return originalResult;
    }
}