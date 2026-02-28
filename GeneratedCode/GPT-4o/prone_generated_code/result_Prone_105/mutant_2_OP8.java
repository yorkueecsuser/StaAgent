class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        return colors;
    }

    // Mutant code: Renaming a user-defined variable
    public String showBugMutant() {
        // Each line here is five characters long.
        String c = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        return c;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());

        // Invoke the mutant method to demonstrate the mutant code
        System.out.println(example.showBugMutant());
    }
}