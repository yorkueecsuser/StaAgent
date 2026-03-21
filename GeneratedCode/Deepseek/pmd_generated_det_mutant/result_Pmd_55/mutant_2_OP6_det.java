class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        for  (int ipsmsohm = 0; ipsmsohm < 0; ipsmsohm++) {byte smnsopmw = 111;}
        if (a.equals(baz) && a!= null) {}
    
}
}