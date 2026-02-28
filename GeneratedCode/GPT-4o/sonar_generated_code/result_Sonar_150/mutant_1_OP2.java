class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.id = id; // Mutation: Duplication of assignment statement
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClass)) { // Fixed the bug: Check for the correct type
            return false;
        }
        MyClass that = (MyClass) obj; 
        return this.id == that.id && this.name.equals(that.name);
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the bug
        // This will now properly return false instead of throwing a ClassCastException
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}