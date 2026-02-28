class BuggyCode {

    String a = null;
    String baz = "hello";

    public void showBug() {
        if (a!= null && a.equals(baz)) {
        }
    }
}