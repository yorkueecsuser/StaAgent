class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        // Mutation: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        return true;
    }

    private boolean getCondition() {
        return false;
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