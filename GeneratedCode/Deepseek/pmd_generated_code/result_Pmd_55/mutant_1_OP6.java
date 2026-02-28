class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
        boolean unreachableLoop = false;
        for (int i = 0; unreachableLoop; i++) {
            System.out.println("Unreachable loop");
        }
    }
}