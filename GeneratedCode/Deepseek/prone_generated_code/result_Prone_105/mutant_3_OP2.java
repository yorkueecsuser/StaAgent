class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace

        String colorsDuplicated = """
            one \s
            two \s
            three
            """; 

        return colors;
    }
}