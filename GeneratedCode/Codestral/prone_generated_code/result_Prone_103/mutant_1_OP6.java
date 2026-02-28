class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        boolean unreachableCondition = checkCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop
            System.out.println("This line will never be executed.");
        }
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    private boolean checkCondition() {
        return false;
    }
}