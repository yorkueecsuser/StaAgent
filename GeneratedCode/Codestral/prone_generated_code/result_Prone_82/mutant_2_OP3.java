class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Original code
        String result = input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'

        // Mutated code: unreachable if statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code will never be executed.");
        }

        return result;
    }
}