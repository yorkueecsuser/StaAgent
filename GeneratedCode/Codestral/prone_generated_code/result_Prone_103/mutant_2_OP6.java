class LossyPrimitiveCompareBug {
    public int showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
            break;
        }
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    private boolean getCondition() {
        return false; // This method is used to dynamically determine the loop condition
    }
}