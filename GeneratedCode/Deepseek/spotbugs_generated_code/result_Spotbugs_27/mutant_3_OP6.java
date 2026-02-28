class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    public boolean equals(CovariantEqualsBug other) {
        return this.value.equals(other.value);
    }

    public void showBug(CovariantEqualsBug other) {
        System.out.println("Using covariant equals(): " + this.equals(other));

        // Mutant: Adding an unreachable for loop
        for (int i = 0; isFalse(); i++) {
            // This code will never be executed
            System.out.println("This is an unreachable for loop.");
        }

        System.out.println("Using Object's equals(): " + this.equals((Object)other));
    }

    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}