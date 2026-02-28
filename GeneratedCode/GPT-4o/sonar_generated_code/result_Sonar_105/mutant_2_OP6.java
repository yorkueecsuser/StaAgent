class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Dummy method to provide a false condition at runtime
    public static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}