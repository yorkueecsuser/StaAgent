class MisleadingEscapedSpaceBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """;

        if (getCondition()) {
            // Unreachable if-else branch
            System.out.println("This line will never execute.");
        } else {
            // Alternative code
            System.out.println("This is the alternative code.");
        }

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}