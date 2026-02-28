class NonNullParameterBug {
    public boolean getFalseCondition() {
        return false;
    }

    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Mutated code start
        if (getFalseCondition()) {
            // This branch is unreachable, but it's added to meet the mutation operator requirements
            System.out.println("This line will never be executed");
        }
        // Mutated code end

        // process the string
    }

    public void showBug() {
        processString(null);
    }
}