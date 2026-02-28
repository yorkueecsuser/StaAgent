class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;

        // Introduced an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }

        return colors;
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}