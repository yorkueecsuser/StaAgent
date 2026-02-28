class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        boolean unreachableCondition = getUnreachableCondition();
        while(unreachableCondition) { // Inserted unreachable while loop
            System.out.println("This code will never be executed");
        }
        return value.equals(null); // Original code remains unchanged
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }

    // Method that returns false to make the while loop unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}