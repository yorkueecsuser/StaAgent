class BuggyCode {

    String a = null;
    String baz = "hello";

    // Mutated Code: Duplicated assignment statement
    public void showBug() {
        if (a.equals(baz))
            if (a.equals(baz) && a!= null) {}
    }
}