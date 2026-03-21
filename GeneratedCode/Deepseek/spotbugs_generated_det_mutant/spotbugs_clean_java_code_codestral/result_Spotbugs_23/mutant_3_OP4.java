class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean shouldRun = getCondition();
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        if (shouldRun) {
            return false; // This is an unreachable statement
        } else {
            return true;
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the if branch unreachable
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