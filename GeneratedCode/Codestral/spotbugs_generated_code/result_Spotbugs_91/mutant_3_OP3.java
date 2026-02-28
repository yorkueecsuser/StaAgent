class SelfComparisonBug {
    private int value;
    private boolean unreachable;

    public SelfComparisonBug() {
        this.unreachable = false;
    }

    public void setParameters(int value, boolean unreachable) {
        this.value = value;
        this.unreachable = unreachable;
    }

    public boolean showBug() {
        if (unreachable) { // Mutant Code: Unreachable if statement
            System.out.println("This line should never be executed.");
        }
        return value == value; // Bug: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}