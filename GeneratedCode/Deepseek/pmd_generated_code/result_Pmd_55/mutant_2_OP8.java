class BuggyCode {

    String z = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (z.equals(baz) && z!= null) {}
    }
}