class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        // Mutant code - Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable loop because getCondition() always returns false
            // This block of code is unreachable
            System.out.println("This is an unreachable block of code.");
        }

        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    // Method to return false for the unreachable loop condition
    private static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}