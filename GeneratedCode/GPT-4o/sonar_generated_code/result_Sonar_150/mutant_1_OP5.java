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
        // Unreachable switch statement mutation
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 9999: // This case is unreachable
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        return this.equals(obj);
    }

    // Helper method to ensure non-compile-time constant is used
    private int getUnreachableValue() {
        return -1;
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