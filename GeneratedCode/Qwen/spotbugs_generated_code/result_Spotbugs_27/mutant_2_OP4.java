class CovariantEqualsExample {

    private int value;

    public CovariantEqualsExample(int value) {
        this.value = value;
    }

    // Covariant equals() method defined, but Object.equals(Object) inherited
    public boolean equals(CovariantEqualsExample other) { // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)  
        if (other == null) {
            return false;
        }
        return this.value == other.value;
    }

    public void showBug() {
        CovariantEqualsExample obj1 = new CovariantEqualsExample(10);
        CovariantEqualsExample obj2 = new CovariantEqualsExample(10);
        Object obj3 = new CovariantEqualsExample(10);

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // This will work as expected
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // This will not work as expected because obj3 is treated as Object

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is reachable code.");
        } else {
            // Unreachable code due to condition always being false at runtime
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug();
    }
}