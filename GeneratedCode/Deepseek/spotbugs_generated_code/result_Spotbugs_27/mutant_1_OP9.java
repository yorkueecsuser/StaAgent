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
        System.out.println("Using covariant equals(): " + this.equals(other));
        System.out.println("Using Object's equals(): " + this.equals((Object)other));
    }

    // New method with a do-while loop equivalent to the while loop in the main method
    public void compareWithObjects(Object[] objects) {
        int i = 0;
        do {
            System.out.println("Comparing with Object: " + this.equals(objects[i]));
            i++;
        } while (i < objects.length);
    }

    public static void main(String[] args) {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2);
        bug1.compareWithObjects(new Object[]{bug2, obj});
    }
}