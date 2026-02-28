class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        boolean condition = getCondition();
        if (condition) {
            int x = 0;  // Unreachable code
        }
        return colors;
    }

    private boolean getCondition(){
        return false;  // Non-final variable for unreachable if statement
    }
}