class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Mutated code: EqualsNull
    // using '==' operator to test for null which is the preferred method
    public boolean isNull() {
        return value == null; // Mutated: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}