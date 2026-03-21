class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = getUnreachableCondition(); // Method call that always returns false
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This line should not be executed");
        }
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false
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