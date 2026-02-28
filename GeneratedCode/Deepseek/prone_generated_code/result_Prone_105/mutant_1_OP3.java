class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        return colors;
    }

    public String mutant() {
        String mutatedColors = """
            one \s
            two \s
            three
            """; // Mutated BUG: MisleadingEscapedSpace

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            return "This code is unreachable";
        }

        return mutatedColors;
    }

    private boolean getCondition() {
        return false; // This will always return false making the if statement unreachable
    }
}