class MisplacedNullCheckBug {
    private String a;
    private String baz;
    private String deadStore; // Dead Store mutation

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        deadStore = "unused"; // Assign a value to the dead store variable
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}