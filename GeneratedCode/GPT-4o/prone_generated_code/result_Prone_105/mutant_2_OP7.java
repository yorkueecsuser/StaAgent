class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Introducing a unique, unreachable while loop
        boolean conditionWhile = getFalseCondition(); // This method returns false, making the loop unreachable
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        
        return colors;
    }

    // Helper method to ensure the while loop condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}