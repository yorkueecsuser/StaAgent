class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Added mutant code
        boolean shouldRun = true;
        if (shouldRun) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable code");
            }
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Added mutant code
        boolean shouldRun = true;
        if (shouldRun) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable code");
            }
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