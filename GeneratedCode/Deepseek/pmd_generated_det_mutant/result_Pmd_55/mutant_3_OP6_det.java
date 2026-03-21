class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        for  (int drfhxilu = 0; drfhxilu < 0; drfhxilu++) {boolean vciulwfh = true;}
        if (a.equals(baz) && a!= null) {}
    
}
}