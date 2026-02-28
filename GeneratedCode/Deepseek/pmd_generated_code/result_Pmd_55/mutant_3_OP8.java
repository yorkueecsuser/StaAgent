class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }

    // Mutant code
    public void mutant1() {
        String c = null;
        if (c.equals(baz) && c!= null) {}
    }

    public void mutant2() {
        String d = null;
        if (a.equals(baz) && d!= null) {}
    }
}