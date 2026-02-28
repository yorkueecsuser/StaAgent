class CovariantEqualsBugExample {

    private String value;

    public CovariantEqualsBugExample(String value) {
        this.value = value;
    }

    public boolean equals(CovariantEqualsBugExample other) { // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
        boolean condition = getCondition(); // Using a method to generate the condition
        if (condition) {
            System.out.println("This will never print");
        } else {
            if (this == other) return true;
            if (other == null || getClass() != other.getClass()) return false;
            return value != null ? value.equals(other.value) : other.value == null;
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false; // This makes the if-condition effectively false at runtime
    }

    // Demonstration method
    public boolean showBug(CovariantEqualsBugExample other) {
        return this.equals(other); // Calls the covariant equals method
    }

    public static void main(String[] args) {
        CovariantEqualsBugExample example1 = new CovariantEqualsBugExample("example");
        CovariantEqualsBugExample example2 = new CovariantEqualsBugExample("example");
        Object example3 = new CovariantEqualsBugExample("example");

        System.out.println(example1.showBug(example2)); // true
        System.out.println(example1.equals(example3)); // false, due to Object.equals(Object) being called
    }
}