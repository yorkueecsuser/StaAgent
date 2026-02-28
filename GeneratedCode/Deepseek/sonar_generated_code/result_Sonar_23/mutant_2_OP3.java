class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        
        boolean condition = false; // Added mutant code by Unreachable If Statement
        if (condition) { // Unreachable branch
            System.out.println("Unreachable branch");
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        boolean condition = false; // Added mutant code by Unreachable If Statement
        if (condition) { // Unreachable branch
            System.out.println("Unreachable branch");
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