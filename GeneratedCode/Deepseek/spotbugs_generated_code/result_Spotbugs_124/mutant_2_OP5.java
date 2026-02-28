class RegularExpressionBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutant: Unreachable switch statement
        if (getFalseCondition()) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should never execute.");
                    break;
                default:
                    break;
            }
        }

        return output;
    }
}