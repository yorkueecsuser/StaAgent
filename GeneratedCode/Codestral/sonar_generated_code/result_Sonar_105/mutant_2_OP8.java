class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int f = 42; // 'field2' renamed to 'f'

    public static void showBug() {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.f; // 'field2' renamed to 'f'
    }
}