class AlwaysTrueClass {
    private String value;
    private String deadStore; // Introducing a dead store

    public AlwaysTrueClass(String value) {
        this.value = value;
        this.deadStore = "I'm not used"; // The dead store is initialized but not used
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
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