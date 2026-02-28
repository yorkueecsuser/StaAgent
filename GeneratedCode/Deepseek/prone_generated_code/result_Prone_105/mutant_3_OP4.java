class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        if (false) {
            System.out.println("This code should not be reachable");
        } else {
            System.out.println("This code will be executed");
        }
        return colors;
    }
}