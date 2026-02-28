class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;

        boolean condition = getCondition();
        while (condition) {
            condition = false;
        }

        return Float.compare(max, diff);
    }

    private boolean getCondition() {
        return false;
    }
}