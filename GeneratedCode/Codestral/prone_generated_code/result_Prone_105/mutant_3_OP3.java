class MisleadingEscapedSpaceBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This code will never be executed.");
        }

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}