class AssertJBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop inserted according to the mutation operator
            System.out.println("This is an unreachable loop");
        }

        return actual.equals(expected)? "No error" : "Description";
    }
}