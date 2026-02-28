class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
        for(int i=0; i<1; i++) {} // Unreachable for loop mutant
    }
}