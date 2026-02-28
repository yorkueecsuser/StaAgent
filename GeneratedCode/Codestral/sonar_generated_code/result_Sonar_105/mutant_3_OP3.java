class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        if (getCondition()) { // Unreachable if statement
            System.out.println("This line should not be executed");
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static boolean getCondition() {
        return false; // Makes the inserted if statement unreachable
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}