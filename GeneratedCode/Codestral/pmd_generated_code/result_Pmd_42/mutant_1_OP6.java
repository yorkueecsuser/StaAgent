class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        boolean alwaysFalse = getCondition();
        for (int i = 0; alwaysFalse; i++) {
            // Unreachable loop
        }
        return value.equals(null); // BUG: EqualsNull
    }

    public boolean getCondition() {
        return false; // This condition always returns false
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}