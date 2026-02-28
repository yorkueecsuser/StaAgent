class CovariantEqualsBug {
    private String dataValue;

    public CovariantEqualsBug(String dataValue) {
        this.dataValue = dataValue;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        return this.dataValue.equals(other.dataValue);
    }

    public void showBug(CovariantEqualsBug otherObject) {  // Mutant code: Rename 'other' to 'otherObject'
        System.out.println("Using covariant equals(): " + this.equals(otherObject));
        System.out.println("Using Object's equals(): " + this.equals((Object)otherObject));
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}