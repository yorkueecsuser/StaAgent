class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String value) {
        this.value = value;
    }

    public boolean equals(CovariantEqualsBug other) {
        return this.value.equals(other.value);
    }

    // Mutant code: Unreachable switch statement
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public void showBug(CovariantEqualsBug other) {
        System.out.println("Using covariant equals(): " + this.equals(other));
        System.out.println("Using Object's equals(): " + this.equals((Object)other));

        // Unreachable switch statement
        if (getCondition()) {
            switch (getValue()) {
                case 1:
                    System.out.println("This is an unreachable statement.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}