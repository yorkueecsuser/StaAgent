class MisleadingEscapedSpace {
    public static void main(String[] args) {
        String colors = """
            one \s
            two \s
            three
            """;
        System.out.println(colors);
    }
}