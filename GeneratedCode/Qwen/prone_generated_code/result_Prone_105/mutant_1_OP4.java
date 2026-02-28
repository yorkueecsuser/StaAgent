class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will run if shouldRun is true
            colors += "reachable";
        } else {
            // This block is unreachable because shouldRun is always false
            colors += "unreachable";
        }
        
        return colors;
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}