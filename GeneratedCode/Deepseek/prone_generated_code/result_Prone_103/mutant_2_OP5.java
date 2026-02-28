class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        int value = getValue();
        boolean condition = getCondition();
        if (condition) {
            return Float.compare(max, diff);
        }
        // Included but not reachable
        switch (value) {
            case 0:
                return 0;
            default:
                return 1;
        }
    }

    private int getValue() {
        return 0;
    }

    private boolean getCondition() {
        return false;
    }
}