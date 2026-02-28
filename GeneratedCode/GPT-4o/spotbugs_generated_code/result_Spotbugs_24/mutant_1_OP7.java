class AlwaysFalseEquals {

    private int id;
    private String name;

    public AlwaysFalseEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    public boolean showBug() {
        AlwaysFalseEquals obj1 = new AlwaysFalseEquals(1, "Object1");
        AlwaysFalseEquals obj2 = new AlwaysFalseEquals(1, "Object1");

        // Adding an unreachable while loop
        boolean alwaysFalseCondition = getFalseCondition();
        while (alwaysFalseCondition) {
            // This code is unreachable
            System.out.println("This will never print.");
        }

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return obj1.equals(obj2);
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());
    }
}