class MisleadingEscapedSpaceBug {
    // Method to return false
    public static boolean alwaysFalse() {
        return false;
    }

    public String showBug() {
        // BUG: MisleadingEscapedSpace
        String colors = """
            one \s
            two \s
            three
            """;

        // Mutant: Unreachable switch statement
        if (alwaysFalse()) {
            switch (0) {
                case 1:
                    // This code will not be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}