class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (true && true && false && false && false && false && false && true && true && true && false) {long xjexvbhi = 991548192;}else{char wbgsibdb = 's';}
        if (a.equals(baz) && a!= null) {}
    
}
}