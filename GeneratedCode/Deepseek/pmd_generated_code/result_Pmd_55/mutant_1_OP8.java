class BuggyCode {

    String x = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (x.equals(baz) && x!= null) {}
    }
}