class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace

        // Unreachable for loop mutation added here
        for(int i = 0; false; i++) {
            // Unreachable code
        }

        return colors;
    }
}