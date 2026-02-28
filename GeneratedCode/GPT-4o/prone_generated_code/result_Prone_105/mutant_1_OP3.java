class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Mutation: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }

        return colors;
    }

    // Method to simulate a condition that returns false
    private boolean getFalseCondition() {
        return false; // This simulates the false condition without being a compile-time constant
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}