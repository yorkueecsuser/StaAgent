class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }

    // Mutant code: Dead Store
    String randomVariable = "random"; // Dead Store Mutation

}