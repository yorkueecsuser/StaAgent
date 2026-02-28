class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        return value.equals(null); // BUG: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable");
        }
    }

    // Method to return false, making the condition for the unreachable if statement always false
    private boolean getUnreachableCondition() {
        return false;
    }
}