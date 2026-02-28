class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";
        String duplicate = actual; // Mutant code: Duplicate assignment

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return actual.equals(expected)? "No error" : "Description";
    }
}