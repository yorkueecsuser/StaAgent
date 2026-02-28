class EqualsNullBug {

    private String value;
    private String r; // Mutant: Renaming 'value' to 'r'

    public EqualsNullBug(String value) {
        this.value = value;
        this.r = value; // Mutant: Assigning 'value' to 'r'
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        return r.equals(null); // Mutant: Using 'r' instead of 'value'
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}