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
        // Inserting an unreachable for loop
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable statement inside the for loop");
        }

        return this.equals(obj);
    }

    private boolean getUnreachableCondition() {
        return false; // Ensures that the for loop is unreachable
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