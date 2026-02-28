class MisleadingEscapedSpace {
    private boolean condition = false;

    public String showBug() {
        String colors = """
            one \\s
            two \\s
            three
            """; // BUG: MisleadingEscapedSpace
        while (false) {
            System.out.println("This loop is unreachable");
        }
        return colors;
    }
}