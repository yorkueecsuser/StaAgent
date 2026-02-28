class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Original code
        String result = input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'

        // Mutant code based on the Unreachable if-else statement mutation operator
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("Unreachable code");
        } else {
            // This branch is always executed
            System.out.println("Reachable code");
        }

        return result;
    }
}