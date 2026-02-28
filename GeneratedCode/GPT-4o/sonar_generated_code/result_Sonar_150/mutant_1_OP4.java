class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Inserting unreachable if-else branch
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This branch is designed to be unreachable.");
        } else {
            MyClass that = (MyClass) obj; // Existing code
            return this.id == that.id && this.name.equals(that.name);
        }
        return false; // This line will never be reached due to static analysis
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    // Method to generate a condition that will always be false at runtime
    private boolean getCondition() {
        return false; // Ensuring this condition is always false at runtime
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