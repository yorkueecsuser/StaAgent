class AssertJBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // Mutant: Unreachable while loop
        while (getCondition()) {
            System.out.println("This line should never execute");
        }

        return actual.equals(expected)? "No error" : "Description";
    }
}