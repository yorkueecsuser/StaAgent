class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        // Mutation Operator: Unreachable while loop
        if (false) {
            while (getCondition()) {
                // Unreachable code
                System.out.println("This code will never execute.");
            }
        }
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

    private boolean getCondition() {
        return false;
    }
}