class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Mutation Operator: Unreachable if-else statement
        if(false) {
            System.out.println("This line of code is unreachable");
        } else {
            System.out.println("This line of code is reachable");
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Mutation Operator: Unreachable if-else statement
        if(true) {
            System.out.println("This line of code is reachable");
        } else {
            System.out.println("This line of code is unreachable");
        }
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}