class Parent {
    static int field1 = Child.method();
    static int field2 = 42;

    public static void showBug() {
        boolean runSwitch = false; // This will always evaluate to false
        int switchValue = getValue(); // This method call will return a value that is not used in the switch statement
        switch(switchValue) {
            case 1:
                // This case will never be reached
                System.out.println("This is an unreachable case");
                break;
        }
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    private static int getValue() {
        return 0; // This method returns a value that is not used in the switch statement
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}