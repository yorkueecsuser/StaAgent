class AssertJBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // Original code
        if (actual.equals(expected)) {
            return "No error";
        }

        // Mutated code (unreachable if statement)
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable block of code");
        }

        return "Description";
    }
}