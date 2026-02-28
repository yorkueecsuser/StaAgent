class AlwaysTrueClass {
    private String val; // Mutated: Renamed variable from 'value' to 'val'

    public AlwaysTrueClass(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return val; // Mutated: Updated method to use the new variable name
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}