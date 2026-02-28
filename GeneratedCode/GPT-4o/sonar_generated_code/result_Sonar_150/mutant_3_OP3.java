class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.id == that.id && this.name.equals(that.name);
    }

    public boolean showBug(Object obj) {
        // Inserting unreachable if statement with a dynamically determined condition
        boolean unreachableCondition = determineCondition(); // Assume this method always returns false
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        }
        return this.equals(obj);
    }

    // Method that always returns false to simulate unreachable condition
    private boolean determineCondition() {
        return false; // This is dynamic at runtime, avoiding compile-time constant issue
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the bug
        // This will throw a ClassCastException instead of returning false
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}