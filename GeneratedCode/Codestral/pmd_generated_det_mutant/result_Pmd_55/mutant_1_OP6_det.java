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
for  (int irentllx = 0; irentllx < 0; irentllx++) {int lcsatjlq = -495438261;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}