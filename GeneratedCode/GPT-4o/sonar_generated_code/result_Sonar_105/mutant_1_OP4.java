class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Addition of an unreachable if-else statement
        boolean condition = getCondition(); // This will always return false
        if (condition) {
            System.out.println("This branch is not reachable.");
        } else {
            System.out.println("Executing else branch as the condition is false.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // A method to dynamically determine the condition at runtime
    private static boolean getCondition() {
        // This method returns false, simulating an unreachable if-else condition
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}