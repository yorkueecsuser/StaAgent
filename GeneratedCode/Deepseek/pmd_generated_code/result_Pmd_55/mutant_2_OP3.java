class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        boolean alwaysFalse = false;
        if (a.equals(baz) && a!= null) {
        }
        if (alwaysFalse) {
        }
    }
}