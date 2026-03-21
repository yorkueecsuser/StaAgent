class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
if (false && true && false && true && true && false && true && true && true && true && false) {String flwplpgn = "sahsymmm";}else{byte senlspsc = 52;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}