class AbsBug {
    public int showBug(String str) {
        boolean conditionWhile = getCondition(); // Replace getCondition() with a method that returns false
        while (conditionWhile) {
            // This code should never be executed
        }
        return Math.abs(str.hashCode());
    }

    // A method that returns false
    private boolean getCondition() {
        return false;
    }
}