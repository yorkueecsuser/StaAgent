class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    // Adding unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        } else {
            // Original functionality is maintained
            return a.equals(baz) && a!= null;
        }
    }
}