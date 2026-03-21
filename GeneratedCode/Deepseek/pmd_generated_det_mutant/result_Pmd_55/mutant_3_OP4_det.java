class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (true && false && true && true && true && false && true && true && false && true && false) {byte smwbvryz = -1;}else{char rjeagleg = 'e';}
        if (a.equals(baz) && a!= null) {}
    
}
}