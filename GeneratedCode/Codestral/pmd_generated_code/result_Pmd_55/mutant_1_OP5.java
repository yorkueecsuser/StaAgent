class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    // Adding unreachable switch statement to the method showBug()
    public boolean showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 0) {
            case 1:
                // This block is unreachable
                System.out.println("This is an unreachable block");
                break;
        }
        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    }

    // This method always returns false to ensure the switch statement is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}