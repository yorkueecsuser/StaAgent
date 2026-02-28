class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1);
    }
}

class Child extends Parent {
    static int method() {
        boolean unreachableCondition = false;
        if (unreachableCondition) { // This if-else branch is unreachable
            return -1;
        } else {
            return Parent.field2;
        }
    }
}