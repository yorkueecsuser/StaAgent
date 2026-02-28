class RegularExpressionBug {
    private boolean getCondition() {
        // Always return false to make the if statement unreachable
        return false;
    }

    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original bug is left untouched

        // Unreachable if statement mutation
        if (getCondition()) {
            // This code block will never be executed
            System.out.println("This is an unreachable code block.");
        }

        return output;
    }
}