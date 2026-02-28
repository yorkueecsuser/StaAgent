class NonNullParameterBug {
    public String processString(String input) {
        // Inserting unreachable if branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable
            throw new RuntimeException("Unreachable branch executed");
        }

        return input.toUpperCase();
    }

    public String showBug() {
        return processString(null);
    }

    // A helper method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false;
    }
}