class MisplacedNullCheckBug {
    private String a;
    private String baz;
    private String deadStore; // Dead store: Unused variable

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