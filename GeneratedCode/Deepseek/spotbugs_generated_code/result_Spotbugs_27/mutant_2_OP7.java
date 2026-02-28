class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    public boolean getCondition() {
        return false;
    }

    public boolean equals(CovariantEqualsBug other) {
        // Mutant: Unreachable while loop inserted
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line will never be printed because the condition is always false.");
        }
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

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}