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
        // Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is never executed
            System.out.println("This is unreachable code.");
        }
        return this.id == that.id && this.name.equals(that.name);
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    // Method to provide a runtime condition that returns false
    private boolean getUnreachableCondition() {
        return false;
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