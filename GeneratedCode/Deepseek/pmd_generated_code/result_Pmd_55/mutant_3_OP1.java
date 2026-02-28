class BuggyCode {

    String a = null;
    String baz = "hello";
    String c = "";  // Unused variable declaration, this is the mutation.

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }
}