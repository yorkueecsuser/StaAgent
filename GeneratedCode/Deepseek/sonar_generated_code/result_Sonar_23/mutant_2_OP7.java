class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        boolean conditionFor = true; // Unreachable While Loop Mutation Starts
        for (int i = 0; conditionFor; i++) { 
            System.out.println("This is a while loop that will never execute due to the unreachable condition.");
        } // Unreachable While Loop Mutation Ends
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}