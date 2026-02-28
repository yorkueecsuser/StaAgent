class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            // Unreachable code: This block will never be executed
            throw new RuntimeException("This line should not be reached");
        }
        if (sb!= null) {
            return sb.toString();
        }
        return null;
    }

    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }
}