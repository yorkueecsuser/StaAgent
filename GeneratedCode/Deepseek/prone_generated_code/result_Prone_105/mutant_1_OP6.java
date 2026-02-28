class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace

        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                // unreachable loop, always false
                System.out.println("This loop is unreachable");
            }
        }

        return colors;
    }

    private boolean getCondition() {
        // this method ensures that the condition of the if statement is not compile-time constant
        return false;
    }
}