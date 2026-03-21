class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (false && false && true && false && true && false && false && false && false && true && false) {int zrxuycmf = -103493842;}
        if (a.equals(baz) && a!= null) {}
    
}
}