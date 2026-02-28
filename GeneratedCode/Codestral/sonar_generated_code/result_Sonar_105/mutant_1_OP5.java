class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        boolean condition = getCondition();

        if (!condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should not be executed");
                    break;
                default:
                    // Default case
                    break;
            }
        }

        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}