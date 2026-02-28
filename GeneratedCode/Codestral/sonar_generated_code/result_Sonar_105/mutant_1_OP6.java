class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        boolean conditionFor = getCondition(); // added method call to dynamically determine the loop condition
        for (int i = 0; conditionFor; i++) { // unreachable for loop inserted
            System.out.println("This line will never execute");
        }
        System.out.println(Parent.field1);
    }

    // added method to dynamically determine the loop condition
    private static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}