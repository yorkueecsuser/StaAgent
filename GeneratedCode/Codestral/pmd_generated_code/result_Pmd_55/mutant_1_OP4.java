class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug() {
        if (getFalseCondition()) {
            // Unreachable if-else branch
            System.out.println("This is an unreachable branch.");
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}