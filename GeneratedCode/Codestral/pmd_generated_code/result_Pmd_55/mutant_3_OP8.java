class MisplacedNullCheckBug {
    private String a;
    private String baz;
    private String x; // Mutant: Renamed variable 'a' to 'x'

    public void setA(String a) {
        this.a = a;
        this.x = a; // Mutant: Also set the new variable 'x'
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        return x.equals(baz) && x!= null; // Mutant: Using the new variable 'x'
    }
}