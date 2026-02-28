class AlwaysTrueEquals {

    private String name;
    private int id;

    public AlwaysTrueEquals(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // Unreachable if-else statement added
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            System.out.println("This is unreachable code inside equals method.");
        } else {
            System.out.println("This is the reachable else block in equals method.");
        }
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    private boolean getFalseCondition() {
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean showBug(AlwaysTrueEquals other) {
        // Demonstrates the bug by comparing two different objects
        return this.equals(other);
    }

    public static void main(String[] args) {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);

        AlwaysTrueEquals test = new AlwaysTrueEquals("Test", 3);
        System.out.println("Are obj1 and obj2 equal? " + test.showBug(obj2));
    }
}