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

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());

        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("This case is also never reached.");
                break;
            default:
                System.out.println("This default case is never reached.");
        }
    }

    // Method to provide a value that makes the switch unreachable
    public static int getUnreachableValue() {
        return 0;
    }
}