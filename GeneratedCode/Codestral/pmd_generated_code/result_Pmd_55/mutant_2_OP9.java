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
        // Introducing a do-while loop for the mutation operator
        do {
            return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
        } while (false);
    }
}