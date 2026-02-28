class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Introduce a non-final variable to create an unreachable if-else statement
        boolean condition = getCondition(); // This method simulates a runtime condition
        if (condition) {
            // Unreachable code
            System.out.println("This will never be printed.");
        } else {
            // Regular flow continues here
            System.out.println("Logic continues as normal.");
        }

        return colors;
    }

    // Simulate a method that provides a runtime condition
    private boolean getCondition() {
        return false; // Always returns false for the unreachable branch
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}