class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBug() {
        // Adding a unique unreachable while loop
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }
        
        return Parent.field1;
    }

    // This method ensures the condition is dynamically determined at runtime
    public static boolean getFalseCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}