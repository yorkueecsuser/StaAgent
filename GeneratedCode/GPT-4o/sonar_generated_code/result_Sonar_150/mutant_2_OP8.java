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
        return this.equals(obj);
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

// Mutant Code
class MyClassMutant {
    private int x;
    private String y;

    public MyClassMutant(int x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        MyClassMutant that = (MyClassMutant) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.x == that.x && this.y.equals(that.y);
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        MyClassMutant obj1 = new MyClassMutant(1, "Object 1");
        String obj2 = "Not a MyClassMutant object";

        // Demonstrating the bug
        // This will throw a ClassCastException instead of returning false
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}