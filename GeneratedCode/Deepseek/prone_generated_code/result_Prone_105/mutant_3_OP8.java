class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        return colors;
    }
    
    public String showMutant() {
        String renamedColors = """
            one \s
            two \s
            three
            """; // Mutant: Renaming
        return renamedColors;
    }
}