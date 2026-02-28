class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        if (shouldRun()) {
            int switchValue = 0;
            switch (switchValue) {
                case 1:
                    System.out.println("This should never be printed");
                    break;
            }
        }
        return value == value; // Self comparison of value with itself
    }

    private boolean shouldRun() {
        return false;
    }
}