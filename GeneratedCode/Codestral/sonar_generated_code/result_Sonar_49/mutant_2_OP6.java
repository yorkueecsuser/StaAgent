class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }

        return actual.equals(expected)? "No error" : "Description";
    }

    private boolean getCondition() {
        return false;
    }
}