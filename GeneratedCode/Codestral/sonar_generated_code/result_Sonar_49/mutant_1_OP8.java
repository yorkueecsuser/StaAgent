class AssertJBug {
    public String showBug() {
        String z = "actual";
        String e = "expected";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return z.equals(e)? "No error" : "Description";
    }
}