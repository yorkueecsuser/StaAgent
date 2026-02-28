class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBug() {
        // Introducing an unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }
        return Parent.field1;
    }

    public static boolean getConditionFor() {
        return false; // Mimics an unreachable condition
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}