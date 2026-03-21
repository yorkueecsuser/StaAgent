class CovariantEqualsBugExample {

    private String value;

    public CovariantEqualsBugExample(String value) {
        this.value = value;
    }

    public boolean equals(CovariantEqualsBugExample other) { // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        return value != null ? value.equals(other.value) : other.value == null;
    }

    // Demonstration method
    public boolean showBug(CovariantEqualsBugExample other) {
        return this.equals(other); // Calls the covariant equals method
    }
public static void main(String [] args){
    CovariantEqualsBugExample example1 = new CovariantEqualsBugExample("example");
    example1 = new CovariantEqualsBugExample("example");
    CovariantEqualsBugExample example2 = new CovariantEqualsBugExample("example");
    Object example3 = new CovariantEqualsBugExample("example");
    System.out.println(example1.showBug(example2));
    System.out.println(example1.equals(example3));
}
}