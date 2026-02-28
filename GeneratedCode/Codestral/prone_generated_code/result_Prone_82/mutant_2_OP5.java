class InvalidPatternSyntaxBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        String result = input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = getFalseCondition();
        if(unreachableCondition) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
                default:
                    System.out.println("This line should also never be executed.");
            }
        }

        return result;
    }
}