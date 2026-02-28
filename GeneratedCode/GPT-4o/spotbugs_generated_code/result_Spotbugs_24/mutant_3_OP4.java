class AlwaysFalseEquals {

    private int id;
    private String name;

    public AlwaysFalseEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    public boolean showBug() {
        AlwaysFalseEquals obj1 = new AlwaysFalseEquals(1, "Object1");
        AlwaysFalseEquals obj2 = new AlwaysFalseEquals(1, "Object1");

        // Inserting an unreachable if-else statement
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return obj1.equals(obj2);
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());
    }
}