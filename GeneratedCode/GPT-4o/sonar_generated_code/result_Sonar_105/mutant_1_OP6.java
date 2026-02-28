class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Inserted unreachable for loop
        boolean unreachableLoopCondition = getLoopCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("This will never print");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Method to generate a condition for the unreachable loop
    private static boolean getLoopCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}