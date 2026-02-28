class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        boolean condition = false;
        if (condition) {
            // This is intentionally added unreachable code.
        }
        return colors;
    }
}