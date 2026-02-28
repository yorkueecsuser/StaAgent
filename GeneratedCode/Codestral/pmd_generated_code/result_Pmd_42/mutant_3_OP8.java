class EqualsNullBug {

    private String value;
    private String mutatedValue; // Mutant: Renaming

    public EqualsNullBug(String value) {
        this.value = value;
        this.mutatedValue = value; // Mutant: Renaming
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        return mutatedValue.equals(null); // Mutant: Renaming
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}