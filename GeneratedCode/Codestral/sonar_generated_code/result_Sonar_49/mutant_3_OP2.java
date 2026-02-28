class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String actualDuplicate = actual; // Mutant: Duplicated assignment
        String expected = "expected";

        return actual.equals(expected)? "No error" : "Description";
    }
}