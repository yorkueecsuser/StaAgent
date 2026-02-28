class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"

        // Adding Unreachable Switch Statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            default:
                // Default case which will never be executed
                System.out.println("Default case in unreachable switch, also not executed.");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // Method to ensure dynamic runtime determination for the switch statement
    private static int getUnreachableSwitchValue() {
        return -1; // A value that does not match any case
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}