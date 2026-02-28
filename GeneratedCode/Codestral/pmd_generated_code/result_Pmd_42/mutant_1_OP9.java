class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    public boolean isNull() {
        // Mutated code: Equivalent Loop Replacement
        int i = 0;
        do {
            if (i == 0) {
                return value.equals(null); // BUG: EqualsNull
            }
            i++;
        } while (i < 1);
        return false;
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}