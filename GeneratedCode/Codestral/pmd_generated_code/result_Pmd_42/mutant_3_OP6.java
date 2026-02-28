class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        return value.equals(null);
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}