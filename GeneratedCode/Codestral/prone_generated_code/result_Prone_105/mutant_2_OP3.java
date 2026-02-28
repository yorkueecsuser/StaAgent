class MisleadingEscapedSpaceBug {
    private boolean getTrue() {
        return true;
    }

    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant code: Unreachable if statement
        if (getTrue() &&!getTrue()) {
            System.out.println("This code is unreachable");
        }

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}