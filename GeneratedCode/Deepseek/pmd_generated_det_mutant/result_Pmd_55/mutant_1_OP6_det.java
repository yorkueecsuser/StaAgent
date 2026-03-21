class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        for  (int zkqlewdb = 0; zkqlewdb < 0; zkqlewdb++) {String tvdirdsx = "zbasjprw";}
        if (a.equals(baz) && a!= null) {}
    
}
}