class LossyPrimitiveCompareBug {
    public int showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable branch executed");
        } else {
            // BUG: LossyPrimitiveCompare
            return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        }
    }
}