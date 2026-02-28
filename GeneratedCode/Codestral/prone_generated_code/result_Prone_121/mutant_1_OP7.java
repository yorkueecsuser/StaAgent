class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        boolean conditionWhile = isUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }

    private boolean isUnreachableCondition() {
        return false;
    }
}