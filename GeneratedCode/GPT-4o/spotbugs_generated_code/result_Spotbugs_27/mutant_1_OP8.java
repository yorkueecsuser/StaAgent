class CovariantEqualsBugExample {

    private String x; // Renamed 'value' to 'x'

    public CovariantEqualsBugExample(String x) { // Renamed constructor parameter 'value' to 'x'
        this.x = x; // Updated variable name to 'x'
    }

    public boolean equals(CovariantEqualsBugExample other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        return x != null ? x.equals(other.x) : other.x == null; // Updated variable name to 'x'
    }

    public boolean showBug(CovariantEqualsBugExample other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        CovariantEqualsBugExample example1 = new CovariantEqualsBugExample("example");
        CovariantEqualsBugExample example2 = new CovariantEqualsBugExample("example");
        Object example3 = new CovariantEqualsBugExample("example");

        System.out.println(example1.showBug(example2)); // true
        System.out.println(example1.equals(example3)); // false, due to Object.equals(Object) being called
    }
}