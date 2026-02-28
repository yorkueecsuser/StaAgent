class BuggyEqualsClass {
    private int value;
    private int renamedValue; // Mutant: Introduced a new variable and renamed it

    public BuggyEqualsClass(int value) {
        this.value = value;
        this.renamedValue = value; // Mutant: Assigned value to the new variable
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false;
    }

    public int getValue() {
        return this.renamedValue; // Mutant: Changed getter to return the new variable
    }

    public void showBug() {
        BuggyEqualsClass obj1 = new BuggyEqualsClass(5);
        BuggyEqualsClass obj2 = new BuggyEqualsClass(5);
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));
    }
}