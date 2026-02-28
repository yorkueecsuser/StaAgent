class MisleadingEscapedSpace {
    public String showBug() {
        String misleadingEscapedSpace = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        return misleadingEscapedSpace;
    }
}