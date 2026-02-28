class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable branch added here
            System.out.println("This is unreachable code");
        } else {
            // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
            return false;
        }
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