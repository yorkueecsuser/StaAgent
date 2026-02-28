class NonNullParameterBug {
    public String processString(String input) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return "unreachable";
        } else {
            return input.toUpperCase(); // Original bug remains
        }
    }

    public String showBug() {
        return processString(null);
    }

    private boolean getCondition() {
        return false; // Always returns false to make the condition unreachable
    }
}