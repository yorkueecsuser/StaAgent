class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original bug: RE_POSSIBLE_UNINTENDED_PATTERN

        // Mutant code: Unreachable for loop
        boolean isLoopCondition = false;
        for (int i = 0; isLoopCondition; i++) {
            System.out.println("This line should never execute");
        }

        return output;
    }
}