class MisleadingEscapedSpace {
    private boolean condition = true;

    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        return colors;
    }
    
    public void addUnreachableLoop() {
        while (condition) {
            System.out.println("This is an unreachable loop.");
        }
    }
}