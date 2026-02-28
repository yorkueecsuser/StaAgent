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
    private int id;
    private String a; // Variable 'name' renamed to 'a'

    public MyClassMutant(int id, String a) { // Parameter 'name' renamed to 'a'
        this.id = id;
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClassMutant)) return false;
        MyClassMutant that = (MyClassMutant) obj;
        return this.id == that.id && this.a.equals(that.a);
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        MyClassMutant obj1 = new MyClassMutant(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the corrected equality check
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);
    }
}