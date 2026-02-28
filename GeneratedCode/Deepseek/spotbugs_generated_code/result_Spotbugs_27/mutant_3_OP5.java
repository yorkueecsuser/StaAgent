class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        // Mutation Operator: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method should always return a value that is not part of the case statements
        switch (unreachableValue) {
            case 1:
                return true; // Unreachable statement
            case 2:
                return false; // Unreachable statement
        }
        // Original bug is still present
        return this.value.equals(other.value);
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return -1;
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