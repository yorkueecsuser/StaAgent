class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Added unreachable while loop
        while (isFalse()) {
            // This block of code is unreachable
            System.out.println("This is an unreachable block of code.");
        }

        // Original code
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private boolean isFalse() {
        return false;
    }
}