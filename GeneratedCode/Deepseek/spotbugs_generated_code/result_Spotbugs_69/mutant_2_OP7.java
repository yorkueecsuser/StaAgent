class RedundantNullCheckBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);

        boolean conditionWhile = getFalseCondition();  // Unreachable condition
        while (conditionWhile) {
            // This loop is unreachable
        }

        if (sb!= null) {
            return sb.toString();
        }
        return null;
    }
}