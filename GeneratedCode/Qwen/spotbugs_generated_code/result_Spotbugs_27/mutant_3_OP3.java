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
        // Inserting an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        }
        return this.value == other.value;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        CovariantEqualsExample obj1 = new CovariantEqualsExample(10);
        CovariantEqualsExample obj2 = new CovariantEqualsExample(10);
        Object obj3 = new CovariantEqualsExample(10);

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // This will work as expected
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // This will not work as expected because obj3 is treated as Object
    }

    public static void main(String[] args) {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug();
    }
}