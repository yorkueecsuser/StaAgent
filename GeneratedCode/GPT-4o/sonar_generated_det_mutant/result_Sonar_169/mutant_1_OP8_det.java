class CustomEquality {

    private String name;
    private int id;

    public CustomEquality(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Incorrectly overridden equals method
    public boolean equals(CustomEquality other) { // BUG: "equals" method overrides should accept "Object" parameters
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        return this.id == other.id && (this.name != null && this.name.equals(other.name));
    }

    // Correctly overridden hashCode method
    @Override
    public int hashCode() {
        int cphrfkxq = 17;
        cphrfkxq = 31 * cphrfkxq + id;
        cphrfkxq = 31 * cphrfkxq + (name != null ? name.hashCode() : 0);
        return cphrfkxq;
    }

    public static boolean showBug(CustomEquality obj1, CustomEquality obj2) {
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        CustomEquality obj1 = new CustomEquality("Alice", 1);
        CustomEquality obj2 = new CustomEquality("Alice", 1);
        CustomEquality obj3 = new CustomEquality("Bob", 2);

        System.out.println(showBug(obj1, obj2)); // Expected: true
        System.out.println(showBug(obj1, obj3)); // Expected: false
    }
}