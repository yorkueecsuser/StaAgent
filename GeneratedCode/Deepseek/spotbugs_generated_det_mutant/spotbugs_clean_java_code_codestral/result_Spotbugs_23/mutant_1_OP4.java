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

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }

        // MUTANT: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            System.out.println("This statement is unreachable");
        } else {
            // This else branch is unreachable
            System.out.println("This else branch is unreachable");
        }
    }

    private boolean getCondition() {
        // Add logic to determine condition
        return false;
    }
}