class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            colors += " unreachable";
        } else {
            // This block will always execute
            colors += " reachable";
        }
        
        return colors;
    }

    private boolean getCondition() {
        // This method returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}