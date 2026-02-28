class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBug() {
        return Parent.field1;
    }
}

class Child extends Parent {
    static int method() {
        // Introduce a dead store variable with a randomly generated name
        int deadstore = 12345678;
        return Parent.field2;
    }
}