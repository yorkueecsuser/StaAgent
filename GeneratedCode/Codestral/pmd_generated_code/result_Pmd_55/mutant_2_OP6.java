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
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}