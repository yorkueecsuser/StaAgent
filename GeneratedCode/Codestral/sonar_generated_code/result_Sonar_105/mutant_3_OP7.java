class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute as the condition is always false
            // Mutated code: Unreachable while loop
            System.out.println("This line should not be printed.");
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}