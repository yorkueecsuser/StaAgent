class MisleadingEscapedSpaceBug {
    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;
        // Mutant: Renamed `colors` to `c`
        String c = colors;
        return c;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}