class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        boolean conditionFor = getCondition(); // Correct usage of a non-final variable
        for (int i = 0; conditionFor; i++) { // Unreachable for loop where the condition is always false
            System.out.println("This line should never execute");
        }
        System.out.println(Parent.field1);
    }

    private static boolean getCondition() { // Dummy method to return false
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}