class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        short gcjugvpu = -3890;
        if (a.equals(baz) && a!= null) {}
    
}
}