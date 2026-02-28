class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field1_dup = Child.method(); // Mutated code: Duplicated assignment
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1); // will display "0" instead of "42"
        System.out.println(Parent.field1_dup); // Mutated code: Print duplicate value
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}