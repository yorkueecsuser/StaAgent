class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (false && true && false && true && false && false && true && false && true && false && false) {byte ijnnrgqp = -46;}
        if (a.equals(baz) && a!= null) {}
    
}
}