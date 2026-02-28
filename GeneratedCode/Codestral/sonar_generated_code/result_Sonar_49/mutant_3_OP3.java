class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("This branch should never be executed");
        }

        return actual.equals(expected)? "No error" : "Description";
    }

    // Method to provide a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }
}