class MisleadingEscapedSpaceBug {
    private boolean getCondition() {
        return false; // Always return false to make the branch unreachable
    }

    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """;

        // Inserted unreachable if-else statement
        if (getCondition()) {
            // This code will never be executed
            System.out.println("Unreachable code executed.");
        } else {
            // This is the unreachable branch
            colors = "red\ngreen\nblue";
        }

        return colors;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}