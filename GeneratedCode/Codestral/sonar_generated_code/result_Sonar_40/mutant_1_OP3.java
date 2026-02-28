class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Mutant code: Unreachable if statement
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // This block will never be executed
            System.out.println("This is an unreachable block");
        }

        return result;
    }

    // Method to return false for the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}