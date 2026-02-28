class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false;
    }

    public int getValue() {
        return value;
    }

    public void showBug() {
        // Mutant code: Renaming variables
        BuggyEqualsClass objA = new BuggyEqualsClass(5);
        BuggyEqualsClass objB = new BuggyEqualsClass(5);
        System.out.println("Are objA and objB equal? " + objA.equals(objB));
    }
}