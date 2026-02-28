class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        boolean condition = false;
        if (condition) {
            // some unreachable code
            System.out.println("This code is unreachable.");
        }
    }

    public static void showBug() {
        boolean condition = false;
        if (condition) {
            // some unreachable code
            System.out.println("This code is unreachable.");
        }

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