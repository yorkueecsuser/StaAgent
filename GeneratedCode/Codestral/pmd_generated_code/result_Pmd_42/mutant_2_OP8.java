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
    }

    // Mutant Code: Renaming
    public void showMutant() {
        String x = value;
        if (x == null) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}