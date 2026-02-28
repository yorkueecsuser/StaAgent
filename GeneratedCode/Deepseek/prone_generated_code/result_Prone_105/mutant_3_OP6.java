class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // do nothing, unreachable
        }
        return colors;
    }
}