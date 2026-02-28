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

        // Mutated code
        CovariantEqualsExample a = new CovariantEqualsExample(20);
        CovariantEqualsExample b = new CovariantEqualsExample(20);
        Object c = new CovariantEqualsExample(20);

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
    }

    public static void main(String[] args) {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug();
    }
}