class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int f = 42; // Mutant code

    public static void showBug() {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    public static void showMutant() {
        System.out.println(Parent.f); // Mutant code, will display "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.f; // Mutant code
    }
}