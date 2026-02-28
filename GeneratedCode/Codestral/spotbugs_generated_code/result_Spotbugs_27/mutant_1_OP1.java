class CovariantEqualsBug {
    private String value;
    // Dead Store Mutation
    private int deadStoreVariable;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        return this.value.equals(other.value);
    }

    public void showBug(CovariantEqualsBug other) {
        System.out.println("Using covariant equals(): " + this.equals(other));
        System.out.println("Using Object's equals(): " + this.equals((Object)other));
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();
        // Using the dead store variable to prevent compiler warnings
        bug1.deadStoreVariable = 10;

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}