class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        int cgbqiaui = 0;switch  (cgbqiaui) {case 1:float npywyhde = 54647587;break;default:String xnjqcahb = "huklmawp";break;}
        if (a.equals(baz) && a!= null) {}
    
}
}