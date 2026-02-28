class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        for (int i = 0; getCondition(); i++) { // MUTANT: Unreachable for loop
            System.out.println("This loop will never execute");
        }
        return value.equals(null); // BUG: EqualsNull
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}