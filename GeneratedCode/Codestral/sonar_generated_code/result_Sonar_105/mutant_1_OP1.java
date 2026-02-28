class Parent {
    static int field1 = Child.method();
    static int field2 = 42;
    static int deadStoreVariable = 0; // Dead store mutant

    public static void showBug() {
        System.out.println(Parent.field1); // will display "0" instead of "42"
        deadStoreVariable++; // Using the dead store variable to avoid compile error
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}