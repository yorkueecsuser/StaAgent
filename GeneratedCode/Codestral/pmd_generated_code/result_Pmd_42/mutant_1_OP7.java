class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        while (getCondition()) { // Inserted unreachable while loop
            // This block of code will never be executed
        }
        return value.equals(null);
    }

    public boolean getCondition() {
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