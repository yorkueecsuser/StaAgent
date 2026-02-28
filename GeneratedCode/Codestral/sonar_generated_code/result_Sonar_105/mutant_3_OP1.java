class Parent {
    static int field1 = Child.method();
    static int field2 = 42;
    static int deadStoreVar = 0; // Mutation: Dead Store

    public static void showBug() {
        System.out.println(Parent.field1); // will display "0" instead of "42"
        deadStoreVar = 1; // To ensure the dead store variable is not completely unused
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}