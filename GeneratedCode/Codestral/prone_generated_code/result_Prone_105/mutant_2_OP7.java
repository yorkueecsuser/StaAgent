class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }

        return colors;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}