class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        boolean condition = getCondition();
        while (condition) { // Mutant: Unreachable while loop
            // This loop is unreachable because the condition is always false
        }

        String result = input.replaceAll("[c̈d̈]", "X");
        return result;
    }

    private boolean getCondition() {
        return false; // This will make the while loop unreachable
    }
}