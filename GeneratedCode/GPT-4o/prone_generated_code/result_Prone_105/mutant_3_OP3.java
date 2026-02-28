class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Inserting an unreachable if branch with a non-final variable condition
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }

        return colors;
    }

    // Method to provide a false condition
    private boolean getFalseCondition() {
        return false; // Dynamically returns false
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}