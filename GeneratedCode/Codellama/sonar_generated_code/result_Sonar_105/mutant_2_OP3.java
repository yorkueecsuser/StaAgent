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

// Unreachable if statement mutation
if (false) {
    System.out.println("This statement is unreachable");
}

// Unreachable while loop mutation
while (false) {
    System.out.println("This loop is unreachable");
}

// Unreachable for loop mutation
for (int i = 0; false; i++) {
    System.out.println("This loop is unreachable");
}

// Unreachable if-else statement mutation
if (false) {
    System.out.println("This statement is unreachable");
} else {
    System.out.println("This statement is reachable");
}

// Unreachable switch statement mutation
switch (0) {
    case 1:
        System.out.println("This case is unreachable");
        break;
    default:
        System.out.println("This case is reachable");
        break;
}