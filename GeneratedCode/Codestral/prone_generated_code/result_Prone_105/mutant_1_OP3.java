class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // MUTANT: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line is unreachable");
        }

        return colors;
    }

    // Helper method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}