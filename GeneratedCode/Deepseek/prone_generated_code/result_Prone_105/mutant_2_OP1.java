class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """;
        String deadStore12345678 = ""; // mutation: Dead Store
        return colors;
    }
}