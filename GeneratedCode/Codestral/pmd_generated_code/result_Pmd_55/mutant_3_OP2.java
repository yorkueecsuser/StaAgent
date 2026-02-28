class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
        this.a = a; // Duplicated line
    }

    public void setBaz(String baz) {
        this.baz = baz;
        this.baz = baz; // Duplicated line
    }

    public boolean showBug() {
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}