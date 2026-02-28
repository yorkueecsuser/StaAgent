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
        // Adding a switch statement to demonstrate the mutation operator
        // The switch condition is set to an unreachable case to satisfy the mutation operator requirements
        int unreachableCase = getUnreachableValue();
        switch (unreachableCase) {
            case 42:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Continue with the existing logic
                return this.equals(obj);
        }
        return false; // In case the switch statement somehow gets executed
    }

    private int getUnreachableValue() {
        return -1; // Value chosen does not match any case in the switch statement
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