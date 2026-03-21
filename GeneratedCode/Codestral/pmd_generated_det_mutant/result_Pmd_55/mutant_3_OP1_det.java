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
double apfvkonh = 404342024;

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}