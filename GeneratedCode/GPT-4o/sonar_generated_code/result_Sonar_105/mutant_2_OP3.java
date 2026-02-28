class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Unreachable if branch with non-final variable
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Method to return a false condition
    public static boolean getFalseCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}