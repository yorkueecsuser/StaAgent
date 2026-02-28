class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        String colors2 = """
            one 
            two 
            three
            """; // Mutant: Duplication
        return colors;
    }
}