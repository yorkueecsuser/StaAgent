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
        int i = 0;
        do {
            i++;
            if (a.equals(baz) && a!= null) {} // BUG: MisplacedNullCheck
        } while (i < 1);
        return a!= null;
    }
}