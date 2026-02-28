class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant: Duplicate the assignment statement
        String colorsDuplicate = """
            one \s
            two \s
            three
            """;

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}