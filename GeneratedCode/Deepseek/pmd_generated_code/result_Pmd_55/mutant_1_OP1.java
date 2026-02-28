class BuggyCode {

    String a = null;
    String baz = "hello";
    String m8j1z8n = "some random string"; // Dead Store Mutant

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }
}