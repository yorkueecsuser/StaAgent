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
if (false && false && true && true && false && true && false && false && true && true && false) {float dgaqhoyd = 196212551;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}