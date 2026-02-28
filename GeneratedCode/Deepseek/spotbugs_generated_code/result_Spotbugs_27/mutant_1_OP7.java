class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        return this.value.equals(other.value);
    }

    public void showBug(CovariantEqualsBug other) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code mutant
            int i = 0;
            i = i / i; // This will result in a division by zero error if the loop is executed, but it's unreachable
        }
        System.out.println("Using covariant equals(): " + this.equals(other));
        System.out.println("Using Object's equals(): " + this.equals((Object)other));
    }

    private boolean getCondition() {
        return false; // This condition ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}