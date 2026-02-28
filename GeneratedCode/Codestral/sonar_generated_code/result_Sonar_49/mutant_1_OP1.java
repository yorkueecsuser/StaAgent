class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";
        String deadStore = "deadCode"; // Added dead store variable

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return actual.equals(expected)? "No error" : "Description";
    }
}