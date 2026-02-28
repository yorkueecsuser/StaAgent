class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // MUTANT: Duplication
        int duplicateResult = (Integer.MAX_VALUE == Integer.MAX_VALUE - 1);

        return result;
    }
}