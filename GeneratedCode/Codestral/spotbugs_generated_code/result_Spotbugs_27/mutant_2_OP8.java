class CovariantEqualsBug {
    private String value;

    public CovariantEqualsBug(String a) { // Renamed 'value' to 'a'
        this.value = a;
    }

    // Bug: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    public boolean equals(CovariantEqualsBug other) {
        return this.value.equals(other.value);
    }

    public void showBug(CovariantEqualsBug b) { // Renamed 'other' to 'b'
        System.out.println("Using covariant equals(): " + this.equals(b));
        System.out.println("Using Object's equals(): " + this.equals((Object)b));
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        System.out.println("Comparing with Object: " + bug1.equals(obj));
    }
}