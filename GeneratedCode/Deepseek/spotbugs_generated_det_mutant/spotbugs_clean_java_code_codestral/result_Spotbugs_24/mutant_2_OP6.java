class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false;
    }

    public int getValue() {
        return value;
    }

    public void showBug() {
        BuggyEqualsClass obj1 = new BuggyEqualsClass(5);
        BuggyEqualsClass obj2 = new BuggyEqualsClass(5);
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));

        // Unreachable for loop mutation (Mutation Operator: Unreachable for loop)
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    // New method to ensure the for loop in showBug is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}