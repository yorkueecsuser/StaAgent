class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        // Mutation Operator: Unreachable for loop
        for (int i = 0; alwaysFalse(); i++) {
            System.out.println("This code is unreachable");
        }
        return this.value.equals(other.value);
    }

    private boolean alwaysFalse() {
        return false;
    }

    public void showBug(CovariantEqualsBug other) {
        System.out.println("Using covariant equals(): " + this.equals(other));
        System.out.println("Using Object's equals(): " + this.equals((Object)other));
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}