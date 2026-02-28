class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Added unreachable if-else branch
        boolean condition = getCondition(); // This will always return false
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Method to simulate a condition that is always false
    public static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}