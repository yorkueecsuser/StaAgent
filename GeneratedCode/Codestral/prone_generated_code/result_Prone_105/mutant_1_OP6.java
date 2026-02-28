class MisleadingEscapedSpaceBug {
    public String showBug() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        String colors = """
            one \s
            two \s
            three
            """;
        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}