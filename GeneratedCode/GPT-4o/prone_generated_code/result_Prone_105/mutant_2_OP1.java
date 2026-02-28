class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Dead Store: Inserting unused variable declaration
        int abcdxyzq = 42;

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}