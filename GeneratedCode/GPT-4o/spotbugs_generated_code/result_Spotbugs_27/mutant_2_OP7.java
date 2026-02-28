class CovariantEqualsBugExample {

    private String value;

    public CovariantEqualsBugExample(String value) {
        this.value = value;
    }

    public boolean equals(CovariantEqualsBugExample other) { 
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        
        // Unreachable while loop mutation
        boolean conditionWhile = getConditionForLoop(); 
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is unreachable");
        }
        
        return value != null ? value.equals(other.value) : other.value == null;
    }

    // Helper method to simulate dynamic condition for the unreachable loop
    private boolean getConditionForLoop() {
        return false; // This makes the loop unreachable at runtime
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