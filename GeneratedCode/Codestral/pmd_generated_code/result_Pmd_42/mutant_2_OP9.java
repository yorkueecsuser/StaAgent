class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Mutated bug: EqualsNull
    // still using equals() method to test for null which is not recommended
    public boolean isNull() {
        return value.equals(null); // Mutated BUG: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}