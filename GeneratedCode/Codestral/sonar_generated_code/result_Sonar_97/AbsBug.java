class AbsBug {
    public int showBug(String str) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // this loop is intentionally left empty
        }
        return Math.abs(str.hashCode());
    }

    private boolean getCondition() {
        return false;
    }
}