class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // Ensure dynamic condition
        while (conditionWhile) {
            // This block is unreachable due to the false condition
            System.out.println("Unreachable code");
        }

        return colors;
    }

    // Method to simulate a condition that evaluates to false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}