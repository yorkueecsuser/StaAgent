class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        // If statement mutant
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println(Parent.field1); // will display "0" instead of "42"
        }

        // While loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }

        // For loop mutant
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }

        // If-else statement mutant
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println(Parent.field1); // will display "0" instead of "42"
        }

        // Switch statement mutant
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println(Parent.field1); // will display "0" instead of "42"
        }
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}