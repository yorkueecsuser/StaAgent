class NonNullParameterBug {
    public String processString(String input) {
        if (alwaysFalse()) { // Unreachable if-else statement mutation
            return null;
        } else {
            return input.toUpperCase(); // Original bug remains intact
        }
    }

    public String showBug() {
        return processString(null);
    }

    private boolean alwaysFalse() { // Method to ensure the condition is always false
        return false;
    }
}