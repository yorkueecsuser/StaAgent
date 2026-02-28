class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable because unreachableCondition will always be false
            System.out.println("This is an unreachable statement.");
        } else {
            System.out.println("This is a reachable statement.");
        }

        return colors;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}