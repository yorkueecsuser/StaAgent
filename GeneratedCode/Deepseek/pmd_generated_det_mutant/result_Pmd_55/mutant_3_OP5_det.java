class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        int loxaiaev = 0;switch  (loxaiaev) {case 1:long cciyhonx = 414303038;break;default:byte aaktosup = -30;break;}
        if (a.equals(baz) && a!= null) {}
    
}
}