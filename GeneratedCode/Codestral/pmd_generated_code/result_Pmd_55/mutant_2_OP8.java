class MisplacedNullCheckBug {
    private String a;
    private String baz;
    private String x;  // Mutant: Renamed variable 'a' to 'x'

    public void setA(String a) {
        this.a = a;
        this.x = a;  // Mutant: Added this line to ensure 'x' is correctly updated
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        return x.equals(baz) && x!= null;  // Mutant: Updated the variable name in this line
    }
}