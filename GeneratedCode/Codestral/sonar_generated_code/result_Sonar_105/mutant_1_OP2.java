class Parent {
    static int field1 = Child.method(); // Original assignment
    static int field3 = field1; // Mutant: Duplicated assignment
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1); // Will display "0" instead of "42"
        System.out.println(Parent.field3); // Will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}