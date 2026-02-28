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
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            int x = 10 / 0;
        } else {
            // Original code
            return a.equals(baz) && a!= null;
        }
    }
}