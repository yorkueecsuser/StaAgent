class LossyPrimitiveCompareBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        boolean unreachableCondition = getFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable as the condition is always false
        }
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}