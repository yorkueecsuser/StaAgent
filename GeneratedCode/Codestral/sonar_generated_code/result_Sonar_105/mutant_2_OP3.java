class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1);
    }
}

class Child extends Parent {
    static int method() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            return 0;
        }
        return Parent.field2;
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}