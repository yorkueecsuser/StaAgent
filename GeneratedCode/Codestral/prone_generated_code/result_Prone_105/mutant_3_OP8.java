class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant code
        String renamedColors = colors;
        return renamedColors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}