class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable because the condition is always false
            System.out.println("This will never be printed.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Method to provide a condition for the while loop
    public static boolean getCondition() {
        return false; // This makes the while loop unreachable
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}