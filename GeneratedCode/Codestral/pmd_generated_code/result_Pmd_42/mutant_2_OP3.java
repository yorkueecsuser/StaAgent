class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        return value.equals(null);
    }

    private boolean getUnreachableCondition() {
        return false;  // This is always false to make the condition unreachable
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            /* This block of code is unreachable. For the mutant, we just print a statement. */
            System.out.println("This is an unreachable block of code.");
        }
    }
}