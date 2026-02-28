class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Inserting unreachable for loop as a mutant
        boolean conditionFor = getFalseCondition(); // This method will always return false
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
            System.out.println("This is an unreachable for loop");
        }

        return colors;
    }

    // Method to simulate an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}