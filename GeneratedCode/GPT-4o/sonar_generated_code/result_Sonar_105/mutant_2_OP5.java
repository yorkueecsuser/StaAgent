class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
        
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will never be printed too.");
                break;
            default:
                System.out.println("This will also never be printed.");
                break;
        }
    }

    public static int showBug() {
        return Parent.field1;
    }

    // This method ensures that the switch statement is unreachable by returning a constant value that is not matched in the switch cases.
    public static int getUnreachableValue() {
        return 0; // The switch cases do not handle this value
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}