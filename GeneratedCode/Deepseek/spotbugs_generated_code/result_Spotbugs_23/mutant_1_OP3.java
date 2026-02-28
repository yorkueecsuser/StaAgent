class AlwaysTrueClass {
    private String value;
    private boolean unreachableCondition = false;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Original bug: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }

        // Mutated code: Inserted unreachable if branch
        if (unreachableCondition) {
            System.out.println("This statement is unreachable");
        }
    }
}