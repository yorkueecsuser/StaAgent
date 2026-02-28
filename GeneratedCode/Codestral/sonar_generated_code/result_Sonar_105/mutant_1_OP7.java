class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1);
    }
}

class Child extends Parent {
    static int method() {
        boolean condition = getCondition();
        while (condition) {  // Mutant code: Unreachable while loop
            // This loop is unreachable because the condition is always false
        }
        return Parent.field2;
    }

    // Dynamically determine the condition for the while loop
    private static boolean getCondition() {
        return false;
    }
}