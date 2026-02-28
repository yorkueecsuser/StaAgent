class MisplacedNullCheckBug {
    private String a;
    private String baz;
    private String xyzabcde; // Dead Store: Unused variable declaration

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}