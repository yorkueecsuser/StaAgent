class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private boolean getCondition() {
        return false; // Always return false to make the switch statement unreachable
    }

    public boolean showBug() {
        // Adding unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int tempValue = 0;
            switch(tempValue) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}