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
        boolean unreachableCondition = checkUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code - inserted per mutation operator
            System.out.println("This line should never be executed.");
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }

    private boolean checkUnreachableCondition() {
        return false; // Always returns false, making the loop unreachable
    }
}