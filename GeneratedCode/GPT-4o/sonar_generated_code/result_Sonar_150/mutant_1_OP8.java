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

// Mutant Code: Renaming user-defined variables
class a {
    private int b;
    private String c;

    public a(int b, String c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object d) {
        a e = (a) d; // BUG: "equals(Object obj)" should test the argument's type
        return this.b == e.b && this.c.equals(e.c);
    }

    public boolean f(Object d) {
        return this.equals(d);
    }

    public static void main(String[] args) {
        a g = new a(1, "Object 1");
        String h = "Not a MyClass object";

        // Demonstrating the bug
        // This will throw a ClassCastException instead of returning false
        boolean result = g.f(h);
        System.out.println("Result: " + result);
    }
}