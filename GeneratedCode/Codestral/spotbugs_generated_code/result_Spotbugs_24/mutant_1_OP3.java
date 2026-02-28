class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // The original bug: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        boolean originalBug = false;

        // New mutant: Unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This line is unreachable!");
        }

        return originalBug;
    }

    // Method to return a false value for the unreachable condition
    private boolean isUnreachableCondition() {
        return false;
    }

    public int getValue() {
        return value;
    }

    public void showBug() {
        BuggyEqualsClass obj1 = new BuggyEqualsClass(5);
        BuggyEqualsClass obj2 = new BuggyEqualsClass(5);
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));
    }
}