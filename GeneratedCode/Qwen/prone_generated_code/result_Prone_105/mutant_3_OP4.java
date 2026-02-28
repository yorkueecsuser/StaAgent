class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            colors += " reachable code";
        } else {
            colors += " this is unreachable"; // This branch is unreachable because getCondition() will always return false
        }

        return colors;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else branch unreachable
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}