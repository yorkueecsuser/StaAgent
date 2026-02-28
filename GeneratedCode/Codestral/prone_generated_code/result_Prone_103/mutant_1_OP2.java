class LossyPrimitiveCompareBug {
    public int showBug() {
        int comparison = Integer.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        // Duplicated mutant code
        int comparisonDuplicate = (Integer.MAX_VALUE > Integer.MAX_VALUE - 1)? 1 : ((Integer.MAX_VALUE < Integer.MAX_VALUE - 1)? -1 : 0);
        return comparison;
    }
}