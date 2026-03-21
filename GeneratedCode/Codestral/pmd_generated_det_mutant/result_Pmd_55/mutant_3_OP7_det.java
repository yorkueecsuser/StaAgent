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
boolean cbakloli = false;while (cbakloli && false && false && true && true && true && true && false && true && false && true && false) {char dactmpqf = 'z';}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}