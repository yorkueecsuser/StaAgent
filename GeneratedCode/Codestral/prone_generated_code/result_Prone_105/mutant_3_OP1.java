class MisleadingEscapedSpaceBug {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """;
        // Introduce a dead store
        String unusedVariable = "This variable is not used";
        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}