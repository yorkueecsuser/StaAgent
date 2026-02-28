class AssertJBug {
    public String showBug() {
        String a = "actual";
        String expected = "expected";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return a.equals(expected)? "No error" : "Description";
    }
}