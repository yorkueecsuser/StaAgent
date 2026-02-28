class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make it unreachable
    }

    public boolean showBug() {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code executed");
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}