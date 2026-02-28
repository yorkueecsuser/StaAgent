class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        boolean unreachableCondition = falseMethod();
        while (unreachableCondition) {
            // Code that will never be executed
        }
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    private boolean falseMethod() {
        return false;
    }
}