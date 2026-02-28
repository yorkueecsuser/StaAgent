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

        // Mutated code with renaming
        CovariantEqualsExample x = new CovariantEqualsExample(20);
        CovariantEqualsExample y = new CovariantEqualsExample(20);
        Object z = new CovariantEqualsExample(20);

        System.out.println("x.equals(y): " + x.equals(y)); // This will work as expected
        System.out.println("x.equals(z): " + x.equals(z)); // This will not work as expected because z is treated as Object
    }

    public static void main(String[] args) {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug();
    }
}