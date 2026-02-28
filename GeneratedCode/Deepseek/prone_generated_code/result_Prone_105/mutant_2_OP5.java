class MisleadingEscapedSpace {
    public String showBug() {
        // Mutant 1: Adding a Switch statement with a constant condition 
        String colors = """
            one \s
            two \s
            three
            """;
        switch ("") {
        }
        return colors;
    }
}