class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }

    // Unreachable switch statement mutant
    static void unreachableSwitch() {
        int x = 0;
        switch (x) {
            case 1:
                System.out.println("Reachable code");
                break;
            case 2:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default code");
                break;
        }
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}