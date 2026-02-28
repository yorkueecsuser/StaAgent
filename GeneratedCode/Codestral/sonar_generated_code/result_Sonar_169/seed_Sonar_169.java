class EqualsMethodBug {
    private int value;

    public EqualsMethodBug(int value) {
        this.value = value;
    }

    public boolean equals(EqualsMethodBug other) { // BUG: "equals" method overrides should accept "Object" parameters
        return this.value == other.value;
    }

    public void showBug(EqualsMethodBug other) {
        System.out.println(this.equals(other));
    }

    public static void main(String[] args) {
        EqualsMethodBug obj1 = new EqualsMethodBug(5);
        EqualsMethodBug obj2 = new EqualsMethodBug(5);
        Object obj3 = new EqualsMethodBug(5);

        System.out.println(obj1.equals(obj2)); // Should print true
        System.out.println(obj1.equals(obj3)); // Compilation error: incompatible types: Object cannot be converted to EqualsMethodBug
    }
}