class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {
            // Added mutation
            if (false) {
                System.out.println("Unreachable code");
            }
        }
    }
}