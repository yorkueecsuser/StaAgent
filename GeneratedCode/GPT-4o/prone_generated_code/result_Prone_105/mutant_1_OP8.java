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

    // Mutant: Variable 'example' renamed to 'a'
    public static void main(String[] args) {
        MisleadingEscapedSpaceExample a = new MisleadingEscapedSpaceExample();
        System.out.println(a.showBug());
    }
}