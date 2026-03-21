class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        String uxougsqy = "oormphzh";
        if (a.equals(baz) && a!= null) {}
    
}
}