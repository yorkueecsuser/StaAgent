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

        // Unreachable switch statement added as mutation
        int unreachableCondition = getUnreachableCondition(); // non-final variable
        switch (unreachableCondition) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());
    }
    
    // Method to simulate a condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return 0; // Ensures the case is never matched
    }
}