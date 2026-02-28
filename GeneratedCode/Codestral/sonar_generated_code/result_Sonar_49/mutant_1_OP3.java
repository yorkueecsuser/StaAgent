class AssertJBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        if (getFalseCondition()) {
            // Unreachable if statement mutant
            throw new RuntimeException("Unreachable code executed");
        }

        return actual.equals(expected)? "No error" : "Description";
    }
}