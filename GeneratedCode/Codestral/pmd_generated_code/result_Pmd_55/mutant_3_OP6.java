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
        boolean alwaysFalse = getCondition(); // Added dynamic condition for the loop

        for (int i = 0; alwaysFalse; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }

    private boolean getCondition() { // Added method to return false dynamically
        return false;
    }
}