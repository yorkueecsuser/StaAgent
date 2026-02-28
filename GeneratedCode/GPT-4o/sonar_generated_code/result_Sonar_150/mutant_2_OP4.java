class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Inserting an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // unreachable block
            System.out.println("This message should never be printed.");
        } else {
            // Original code
            if (!(obj instanceof MyClass)) {
                return false;
            }
            MyClass that = (MyClass) obj;
            return this.id == that.id && this.name.equals(that.name);
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the bug
        // This will now correctly return false instead of throwing a ClassCastException
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}