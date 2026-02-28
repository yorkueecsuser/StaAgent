class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Original bug: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        boolean isTrue = true;
        if (isFalseCondition()) {
            // Unreachable if statement
            isTrue = false;
        }
        return isTrue;
    }

    private boolean isFalseCondition() {
        // Dynamically determine the condition at runtime
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