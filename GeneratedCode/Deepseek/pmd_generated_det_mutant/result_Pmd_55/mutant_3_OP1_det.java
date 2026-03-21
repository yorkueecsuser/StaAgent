class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        char iethzwji = 'z';
        if (a.equals(baz) && a!= null) {}
    
}
}