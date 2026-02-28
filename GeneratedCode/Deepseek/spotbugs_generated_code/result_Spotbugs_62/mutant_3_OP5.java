class NonNullParameterBug {
    public String processString(String input) {
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
                // This case is unreachable
                break;
        }
        return input.toUpperCase(); // The original bug is maintained
    }

    public String showBug() {
        return processString(null);
    }
}