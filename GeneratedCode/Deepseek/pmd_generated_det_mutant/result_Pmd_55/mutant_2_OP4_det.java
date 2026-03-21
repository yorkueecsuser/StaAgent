class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (false && false && false && false && false && false && false && true && false && true && false) {boolean jxxcqyyg = true;}else{int mniyzfqb = 311435002;}
        if (a.equals(baz) && a!= null) {}
    
}
}