class NonNullParameterBug {
    public boolean getFalseCondition() {
        return false;
    }

    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Added unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line should be unreachable");
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }
}