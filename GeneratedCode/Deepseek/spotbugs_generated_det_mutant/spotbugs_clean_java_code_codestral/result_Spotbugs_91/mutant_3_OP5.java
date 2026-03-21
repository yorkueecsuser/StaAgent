class SelfComparisonBug {
    private int value;
    private static final int UNREACHABLE_VALUE = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        switch (UNREACHABLE_VALUE) {
            case 1:
                System.out.println("This is an unreachable switch case.");
                break;
        }
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}