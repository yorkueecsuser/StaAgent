class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Unreachable switch statement mutant
class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Unreachable switch statement mutant
class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        switch (false) {
            case 1:
                System.out.println(Parent.field1); // will display "0" instead of "42"
                break;
            default:
                break;
        }
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}