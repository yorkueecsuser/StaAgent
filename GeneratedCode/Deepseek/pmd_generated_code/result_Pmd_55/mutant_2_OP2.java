class BuggyCode {

    String a = null;
    String baz = "hello";

    public void showBug() {
        if (a.equals(baz) && a!= null) {}

        // Mutation: Duplication
        if (a.equals(baz) && a!= null) {}
    }
}