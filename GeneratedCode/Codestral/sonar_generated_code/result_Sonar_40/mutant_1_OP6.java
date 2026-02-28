class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
        }

        return result;
    }

    // This method is used to dynamically determine the condition for the loop
    private boolean getCondition() {
        return false;
    }
}