class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code block
            System.out.println("This is an unreachable while loop");
        }

        return actual.equals(expected)? "No error" : "Description";
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the loop unreachable
        return false;
    }
}