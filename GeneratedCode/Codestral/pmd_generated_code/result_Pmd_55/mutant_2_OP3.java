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
            System.out.println("This code is unreachable.");
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}