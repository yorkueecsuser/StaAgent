class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Introduce unreachable while loop
        boolean condition = returnFalseCondition();
        while (condition) {
            System.out.println("This is unreachable loop.");
        }

        return colors;
    }

    // This method returns a false condition dynamically
    private boolean returnFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}