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
        switch (condition) { // Unreachable switch statement
            case true:
                System.out.println("This is an unreachable case.");
                break;
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }
}