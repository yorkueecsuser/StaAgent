class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Original code
        String result = input.replaceAll("[", "x");

        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }

        return result;
    }
}