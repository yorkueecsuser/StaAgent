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

// Mutation Operator: Unreachable for loop
// Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

// Updated Java Code:
class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // do nothing
        }
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}