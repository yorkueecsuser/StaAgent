class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
        this.value = value; // Mutant: Duplicated assignment statement
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}