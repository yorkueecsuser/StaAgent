class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            one \s // DUPLICATE: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            two \s // DUPLICATE: MisleadingEscapedSpace
            three
            """;
        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}