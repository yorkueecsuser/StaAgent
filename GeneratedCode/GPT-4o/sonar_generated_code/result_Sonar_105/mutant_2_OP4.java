class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
        
        // Introduce unreachable if-else branch
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This branch is always executed");
        }
    }

    public static int showBug() {
        return Parent.field1;
    }
    
    // Method to simulate a dynamic condition
    public static boolean getCondition() {
        return false;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}