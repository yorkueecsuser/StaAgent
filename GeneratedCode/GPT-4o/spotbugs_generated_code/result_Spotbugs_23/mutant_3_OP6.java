class AlwaysTrueEquals {
    
    private String name;
    private int id;

    public AlwaysTrueEquals(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean showBug(AlwaysTrueEquals other) {
        // Demonstrates the bug by comparing two different objects

        // Unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This loop is unreachable.");
        }

        return this.equals(other);
    }

    // Method to ensure the loop condition is dynamically determined at runtime
    private boolean getLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);

        AlwaysTrueEquals test = new AlwaysTrueEquals("Test", 3);
        System.out.println("Are obj1 and obj2 equal? " + test.showBug(obj2));
    }
}