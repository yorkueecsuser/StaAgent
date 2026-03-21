class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (false && true && false && false && true && true && false && true && false && false && false) {byte jgqxqhud = -12;}
        if (a.equals(baz) && a!= null) {}
    
}
}