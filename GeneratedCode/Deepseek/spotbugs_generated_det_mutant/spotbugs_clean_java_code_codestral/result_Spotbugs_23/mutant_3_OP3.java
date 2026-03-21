class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return value;
    }

    private boolean getUnreachableCondition() {
        // Method to return a false condition
        return false;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
            // MUTATION: Inserting unreachable if branch
            if (getUnreachableCondition()) {
                System.out.println("This line will never be executed");
            }
        }
    }
}