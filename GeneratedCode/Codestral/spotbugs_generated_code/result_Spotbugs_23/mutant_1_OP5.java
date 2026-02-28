class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        boolean unreachableCondition = false;

        // MUTANT: Unreachable switch statement
        switch (unreachableCondition) {
            case true:
                // This code will never execute
                System.out.println("This is an unreachable switch statement");
                break;
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
}