class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        while (getCondition()) { // Inserted unreachable while loop
            // This loop will never execute, as getCondition() always returns false
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}