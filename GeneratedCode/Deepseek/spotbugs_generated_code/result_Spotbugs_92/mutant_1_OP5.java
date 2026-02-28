class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean bugPresent = value == value;

        // Mutated code: Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return bugPresent;
    }

    private int getUnreachableValue() {
        return -1;
    }
}