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
if (false && false && false && true && true && false && false && true && true && true && false) {String vgezflwb = "zpqrgbgg";}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}