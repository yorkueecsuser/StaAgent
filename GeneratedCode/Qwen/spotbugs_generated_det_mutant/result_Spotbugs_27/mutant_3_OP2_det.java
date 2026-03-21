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
    obj2 = new CovariantEqualsExample(10);
    Object obj3 = new CovariantEqualsExample(10);
    System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
    System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));
}

    public static void main(String[] args) {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug();
    }
}