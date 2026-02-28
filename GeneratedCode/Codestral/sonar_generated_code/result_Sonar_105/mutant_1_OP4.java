class Parent {
    static boolean unreachableCondition = false;
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        if (unreachableCondition) {
            System.out.println("This line will never be printed");
        } else {
            System.out.println(Parent.field1);
        }
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}