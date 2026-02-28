class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant: Unreachable for loop
        for (int i = 0; isLoopConditionFalse(); i++) {
            // This code will never execute
        }

        return colors;
    }

    private boolean isLoopConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}