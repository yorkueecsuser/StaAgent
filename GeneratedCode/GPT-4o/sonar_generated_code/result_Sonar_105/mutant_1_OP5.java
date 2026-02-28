class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    // Unreachable switch statement added here
    public static int unreachableSwitchExample() {
        int value = getUnreachableSwitchValue();
        switch(value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default Case");
                break;
        }
        return 0;
    }

    // Method to ensure the switch condition is dynamically determined at runtime
    private static int getUnreachableSwitchValue() {
        return 3; // This value does not match any case, making the switch effectively unreachable
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
        unreachableSwitchExample(); // Calling the unreachable switch example
    }

    public static int showBug() {
        return Parent.field1;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}