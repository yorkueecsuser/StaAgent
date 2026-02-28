class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        if (isUnreachable()) { // Unreachable if statement mutant
            System.out.println("Unreachable code");
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean isUnreachable() { // Method always returns false to make if statement unreachable
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}