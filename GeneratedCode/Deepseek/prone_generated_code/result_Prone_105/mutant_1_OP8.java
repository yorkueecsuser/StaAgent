class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        return colors;
    }

    public String renameVariable() {
        String newVariable = """
            one \s
            two \s
            three
            """; // MUTANT: Renaming variable
        return newVariable;
    }
}