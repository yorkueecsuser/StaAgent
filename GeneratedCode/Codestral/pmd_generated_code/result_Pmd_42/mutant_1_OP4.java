class EqualsNullBug {

    private String value;
    private boolean alwaysFalse = false;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        if (alwaysFalse) {
            throw new AssertionError("This branch should be unreachable");
        }
        return value.equals(null); // BUG: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            if (alwaysFalse) {
                throw new AssertionError("This branch should be unreachable");
            }
            System.out.println("Value is not null");
        }
    }
}