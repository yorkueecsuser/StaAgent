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
        String x = a; // Mutation: Renamed 'a' to 'x'
        return x.equals(baz) && x!= null; // BUG: MisplacedNullCheck
    }
}