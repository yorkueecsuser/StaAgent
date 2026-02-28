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
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable
        }

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}