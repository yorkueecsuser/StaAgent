class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MyClass)) { // Added type check and null check to avoid ClassCastException
            return false;
        }
        MyClass that = (MyClass) obj;
        return this.id == that.id && this.name.equals(that.name);
    }

    public boolean showBug(Object obj) {
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
        return this.equals(obj);
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the bug
        // This will no longer throw a ClassCastException, returns false instead
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}