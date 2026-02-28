class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
        }

        return a.equals(baz) && a!= null;
    }
}