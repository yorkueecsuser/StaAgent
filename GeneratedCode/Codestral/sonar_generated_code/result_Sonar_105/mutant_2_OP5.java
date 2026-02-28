class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}