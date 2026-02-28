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

// Mutant 1: Rename field1 to fieldA
class Parent {
    static int fieldA = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.fieldA); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Mutant 2: Rename field2 to fieldB
class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int fieldB = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.fieldB;
    }
}