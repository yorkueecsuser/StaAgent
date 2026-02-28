class Main {
    private static boolean condition = true;

    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        child.sayHello();

        if (condition) {
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("This is the unreachable else block.");
        }
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