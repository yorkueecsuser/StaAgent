class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutant code added according to Unreachable switch statement mutation operator
        final int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case is unreachable
                System.out.println("This line should never execute.");
                break;
        }

        return output;
    }

    private int getUnreachableValue() {
        // This method always returns a value other than 1 to make the switch statement unreachable
        return 0;
    }
}