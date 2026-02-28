class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;
        // Mutant: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never execute, as unreachableCondition is always false
            System.out.println("Unreachable code block.");
        }
        return colors;
    }

    private boolean getUnreachableCondition() {
        // This method should return false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}